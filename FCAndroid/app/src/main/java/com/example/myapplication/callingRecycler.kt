package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_calling_recycler.*

class callingRecycler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calling_recycler)

        val phoneBook = createFakePhoneBook(fakeNumber = 30)
        val phoneBookRecyclerAdapter = PhoneBookRecyclerAdapter(
            phoneBookList = phoneBook,
            inflater = LayoutInflater.from(this@callingRecycler),
            activity = this
        )
        phoneBook_RecyclerView.adapter = phoneBookRecyclerAdapter
        phoneBook_RecyclerView.layoutManager = LinearLayoutManager(this@callingRecycler)

    }

    fun createFakePhoneBook(fakeNumber: Int = 10, phoneBook: PhoneBook = PhoneBook()): PhoneBook {
        for (i in 0 until fakeNumber) {
            phoneBook.addPerson(Person(name = "" + i + "번째 사람", number = "" + i + "번째 전화번호"))
        }
        return phoneBook

    }
}

class PhoneBookRecyclerAdapter(
    val phoneBookList: PhoneBook,
    val inflater: LayoutInflater,
    val activity: Activity
) : RecyclerView.Adapter() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val personName: TextView

        init {
            personName = itemView.findViewById(R.id.person_name)
            itemView.setOnClickListener {
                val intent = Intent(activity, PhoneBookDetailActivity::class.java)
                intent.putExtra("name",phoneBookList.personList.get(adapterPosition).name)
                intent.putExtra("number",phoneBookList.personList.get(adapterPosition).number)
                //startActivity는 appcompatactivity의 상속을 받아야해서 여기서 바로는 사용할 수 없다
                activity.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapter.ViewHolder {
        val view = inflater.inflate(R.layout.phonebook_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return phoneBookList.personList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.personName.setText(phoneBookList.personList.get(position).name)
    }
}