package com.example.myapplication

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RetrofitService {
    @GET("json/students") //baseURL 뒷부분만, get요청
    fun getStudentsList(): Call<ArrayList<PersonFromServer>> //이 타입으로 변환하여 사용

    @POST("json/students/")
    fun createStudents(
        @Body params : HashMap<String, Any>
    ): Call<PersonFromServer> //return 타입

    @POST("json/students/")
    fun createStudentEasy(
        @Body person : PersonFromServer
    ): Call<PersonFromServer> //return 타입

}