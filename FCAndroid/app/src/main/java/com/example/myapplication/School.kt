package com.example.myapplication

import io.realm.RealmObject


open class School: RealmObject(){ //테이블
    var name: String? = null //필드
    var location: String? = null //필드
}