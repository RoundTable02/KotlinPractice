package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val carList = ArrayList<CarForList>()
        for (i in  0 until 10){
            carList.add(CarForList(""+i+" 번째 자동차",""+i+"순위 연산"))
        }

        val adapter = ListViewAdapter(carList, LayoutInflater.from(this@ListViewActivity))
        listView.adapter = adapter
        listView.setOnItemClickListener{ parent, view, position, id ->
            val carName = (adapter.getItem(position) as CarForList).name
            val carEngine = (adapter.getItem(position) as CarForList).engine

            Toast.makeText(this@ListViewActivity,carName+ " " +carEngine,Toast.LENGTH_SHORT).show()
        }

    }
}

class ListViewAdapter(
    val carForList : ArrayList<CarForList>,
    val layoutInflater: LayoutInflater
) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View
        val holder : ViewHolder
        if(convertView == null){
            view = layoutInflater.inflate(R.layout.item_view,null)
            holder = ViewHolder()

            holder.carName = view.findViewById(R.id.car_name)
            holder.carEngine = view.findViewById(R.id.car_engine)

            view.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            view = convertView
        }
        holder.carName?.setText(carForList.get(position).name)
        holder.carName?.setText(carForList.get(position).engine)

        return view
    }

    override fun getItem(position: Int): Any {
        return carForList.get(position) //그리고자 하는 아이템 리스트의 하나(포지션에 해당)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong() //각각 아이디를 붙여줌

    }

    override fun getCount(): Int {
        return carForList.size
    }
}

class ViewHolder{
    var carName: TextView? = null
    var carEngine: TextView? = null
}