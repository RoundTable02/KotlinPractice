package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlinx.android.synthetic.main.activity_realm.*

class RealmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_realm)

        Realm.init(this@RealmActivity)
        val config : RealmConfiguration = RealmConfiguration.Builder() //editor같은 부분
            .deleteRealmIfMigrationNeeded() // 동기화가 필요하면 = 틀에 변화가 생기면 아예 지운다
            .build()
        // 빌더로 시작하는 건 메소드 체이닝(.@.@)로 주로 이루어진다
        Realm.setDefaultConfiguration(config) //realm 형성

        val realm = Realm.getDefaultInstance()

        //Realm 불러오기
        button_save.setOnClickListener{
            realm.executeTransaction {
               //transaction을 실행한다. >> 이 작업이 끝날 때까지 값이 수정될 수 없도록 묶는다
                // A테이블에서 데이터 가져온다
                // B테이블에서 데이터 가져온다
                // C테이블에서 데이터 가져온다
                // 조합한다
                // D테이블에 저장을 한다
                with(it.createObject(School::class.java)){
                    this.name="어떤 대학교"
                    this.location="서울"
                }
            }
        }
        button_load.setOnClickListener{
            realm.executeTransaction{
                val data = it.where(School::class.java).findFirst() // 첫번째 줄을 찾아서 저장한다
                Log.d("dataa",""+data)
            }
        }
//        button_delete.setOnClickListener{
//            realm.executeTransaction{
//                it.where(School::class.java).findAll().deleteFromRealm() //전체를 찾아서 삭제한다
//            }
//        }

    }
}