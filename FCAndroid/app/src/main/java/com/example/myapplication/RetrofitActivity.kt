package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)

        // http://mellowcode.org/json/students/
        val retrofit = Retrofit.Builder()
            .baseUrl("http://mellowcode.org/") // 변하지 않는 도메인 주소
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(RetrofitService::class.java)

        //get 요청
        service.getStudentsList().enqueue(object : Callback<ArrayList<PersonFromServer>>{ //통신을 대기줄에 올려놈
            override fun onFailure(call: Call<ArrayList<PersonFromServer>>, t: Throwable) {
                Log.d("retrofitt","ERROR")
            }

            override fun onResponse(
                call: Call<ArrayList<PersonFromServer>>,
                response: Response<ArrayList<PersonFromServer>>
            ) {
                if(response.isSuccessful){
                    val personList = response.body()
                    Log.d("retrofitt","res : "+personList?.get(0)?.age)
                    val code = response.code()
                    val error = response.errorBody() // 잘 안씀
                    val header = response.headers() // 잘 안씀
                }
            }
        })

        //post 요청
//        val params = HashMap<String, Any>()
//        params.put("name","김개똥")
//        params.put("age",20)
//        params.put("intro","안녕하세요")
//        service.createStudents(params).enqueue(object : Callback<PersonFromServer>{
//            override fun onFailure(call: Call<PersonFromServer>, t: Throwable) {
//            }
//
//            override fun onResponse(
//                call: Call<PersonFromServer>,
//                response: Response<PersonFromServer>
//            ) {
//                if(response.isSuccessful){
//                    val person = response.body()
//                    Log.d("retrofittt","name : "+person?.name)
//
//                }
//            }
//        })
        //post 요청 쉬운버전
        val person = PersonFromServer(name = "김철수", age = 12, intro = "안녕하세요")
        service.createStudentEasy(person).enqueue(object : Callback<PersonFromServer>{
            override fun onFailure(call: Call<PersonFromServer>, t: Throwable) {
            }

            override fun onResponse(
                call: Call<PersonFromServer>,
                response: Response<PersonFromServer>
            ) {
                if(response.isSuccessful){
                    val person = response.body()
                    Log.d("retrofittt","name : "+person?.name)

                }
            }
        })

    }
}