package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.Kotlin.number1
import kotlinx.android.synthetic.main.activity_intent.*

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        change_activity.setOnClickListener {
//            val intent = Intent(this@Intent1, Intent2::class.java)
//            //key, value 방식, 쌍으로 만들어 저장한다
//            intent.putExtra("number1",1)
//            intent.putExtra("number2",2)
//            startActivity(intent)


//            val intent2 = Intent(this@Intent1, Intent2::class.java)
//            // Apply를 이용해 intent2에 하는 작업을 블럭으로 묶을 수 있다.
//            intent2.apply{
//                this.putExtra("number1",1)
//                this.putExtra("number2",1) //this = intent2
//            }
//            startActivityForResult(intent2,200)

            // 암시적 인텐트
            // 대상을 정해주지 않음
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
            //uri parse가 가능한 앱 나와라라
           startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode==200){
            Log.d("number","111")
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}