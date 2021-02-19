package com.example.administrator.databindingapp.ui.activity

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.example.administrator.databindingapp.model.Teacher2
import com.example.administrator.databindingapp.model.Teacher3
import com.gl.databinding.R
import com.gl.databinding.databinding.ActivityBaseobservablesampleBinding

class BaseObservableSampleActivity : AppCompatActivity() {

    private val teacher2: Teacher2 by lazy {
        Teacher2(ObservableField("renyu"), ObservableField(30))
    }

    private val teacher3: Teacher3 by lazy {
        Teacher3()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewDataBinding = DataBindingUtil.setContentView<ActivityBaseobservablesampleBinding>(this, R.layout.activity_baseobservablesample)
        viewDataBinding.teacher2 = teacher2
        viewDataBinding.teacher3 = teacher3

        Handler().postDelayed({
            teacher2.name?.set("PQ")

            teacher3.name = "RGL"
        }, 4000)
    }
}