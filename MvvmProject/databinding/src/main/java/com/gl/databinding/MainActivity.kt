package com.example.administrator.databindingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gl.databinding.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val check = checkCallingOrSelfPermission("com.wuc.aidlservice.permission.ACCESS_SERVICE")

    }
}
