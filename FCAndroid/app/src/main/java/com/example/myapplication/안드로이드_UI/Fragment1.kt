package com.example.myapplication.안드로이드_UI

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class Fragment1 : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View?{
        Log.d("life_cycle","F onCreateView")

        return inflater.inflate(R.layout.fragment01,container,false)
    }
}