package com.example.myapplication

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreference : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

//        val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
        // MODE
        // MODE_PRIVATE : 생성한 application에서만 사용 가능
        // MODE_WORLD_READABLE : 다른 application에서만 사용 가능 -> 읽을 수만 있다
        // MODE_WORLD_WRITABLE : 다른 application에서만 사용 가능 -> 기록도 가능
        // MODE_MULTI_PROCESS : 이미 호출되어 사용중인지 체크
        // MODE_APPEND : 기존 preference에 신규로 추가

//        val editor: SharedPreferences.Editor = sharedPreference.edit()
//        editor.putString("hello","안녕하세요")//key-value
//        editor.commit() //commit을 해야 값이 들어간다
        //sp1 >> SharedPreference >> ("hello","안녕하세요")
        //sp2 >> SharedPreference >> ("hello","안녕하세요11") 다른 sharedpreference에 들어있기 때문에 상관 없다.
        //데이터가 저장되어 다시 실행되어도 그대로 존재한다

        save_btn.setOnClickListener{
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreference.edit()
            editor.putString("hello","안녕하세요")//key-value
            editor.putString("goodbye","안녕히가세요")//key-value
            editor.commit()
        }
        load_button.setOnClickListener{
            //값을 불러오기
            val sharedPreference = getSharedPreferences("sp1",Context.MODE_PRIVATE)
            val value1 = sharedPreference.getString("hello", "데이터 없음1") //hello라는 데이터가 없을 때 '데이터 없음' 리턴 (디폴트)
            val value2 = sharedPreference.getString("goodbye", "데이터 없음2") //hello라는 데이터가 없을 때 '데이터 없음' 리턴 (디폴트)
            Log.d("key-value",""+value1)
            Log.d("key-value",""+value2)

        }
        delete_button.setOnClickListener{
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.remove("hello")
            editor.commit()
        }
        delete_all_button.setOnClickListener{
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.clear()
            editor.commit()
        }
    }

}