package com.example.myapplication

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_network.*
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class NetworkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_network)


        NetworkTask(
            recycler_person,
            LayoutInflater.from(this@NetworkActivity)
        ).execute()
    }
}

class NetworkTask(
    val recyclerView: RecyclerView,
    val inflater: LayoutInflater
) : AsyncTask<Any?, Any?, Array<PersonFromServer>>() {

    override fun onPostExecute(result: Array<PersonFromServer>?) {
        val adapter = PersonAdapter(result!!, inflater)
        recyclerView.adapter = adapter
        super.onPostExecute(result)
    }

    override fun doInBackground(vararg p0: Any?): Array<PersonFromServer>? {
        val urlString: String = "http://mellowcode.org/json/students/"
        val url: URL = URL(urlString)
        val connection: HttpURLConnection = url.openConnection() as HttpURLConnection

        connection.requestMethod = "GET"
        connection.setRequestProperty("Content-Type", "application/json")

        var buffer = ""
        if (connection.responseCode == HttpURLConnection.HTTP_OK) {
            val reader = BufferedReader( // 항상 이렇게 사용함. 사람이 알아들을 수 있는 용어로 번역하는 번역기
                InputStreamReader(
                    connection.inputStream,
                    "UTF-8"
                )
            )
            buffer = reader.readLine()
        }

        val data = Gson().fromJson(buffer, Array<PersonFromServer>::class.java) //리스트가 아닌 객체로 받아야 한다
        return data
    }
}

class PersonAdapter(
    val personList: Array<PersonFromServer>,
    val inflater: LayoutInflater
) : RecyclerView.Adapter<PersonAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView
        val age: TextView
        val intro: TextView
        init{
            name = itemView.findViewById(R.id.person_name)
            age = itemView.findViewById(R.id.person_age)
            intro = itemView.findViewById(R.id.person_ment)

        }
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.personlistitem,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.setText(personList.get(position).name ?:"")
        holder.age.setText(personList.get(position).age.toString() ?:"")
        holder.intro.setText(personList.get(position).intro ?:"")

    }
}

