package com.example.administrator.databindingapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.administrator.databindingapp.ui.fargment.BaseSampleFragment
import com.gl.databinding.R

class BaseSampleFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basesamplefragment)

        supportFragmentManager.beginTransaction().replace(R.id.layout_basesamplefragment, BaseSampleFragment(), "tag").commitAllowingStateLoss()
    }
}