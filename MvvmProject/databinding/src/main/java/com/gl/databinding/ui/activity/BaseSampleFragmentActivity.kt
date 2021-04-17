package com.gl.databinding.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gl.databinding.ui.fargment.BaseSampleFragment
import com.gl.databinding.R

class BaseSampleFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basesamplefragment)

        supportFragmentManager.beginTransaction().replace(R.id.layout_basesamplefragment, BaseSampleFragment(), "tag").commitAllowingStateLoss()
    }
}