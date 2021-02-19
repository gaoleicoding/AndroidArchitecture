package com.example.administrator.databindingapp.ui.activity

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableBoolean
import com.example.administrator.databindingapp.model.DayNight
import com.example.administrator.databindingapp.util.MyHandlers
import com.gl.databinding.R
import com.gl.databinding.databinding.ActivityCustomattributeBinding

class CustomAttributeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewDataBinding = DataBindingUtil.setContentView<ActivityCustomattributeBinding>(this, R.layout.activity_customattribute)
        viewDataBinding.dayNight = DayNight(ObservableBoolean(false))
        viewDataBinding.handlers = MyHandlers()

        Handler().postDelayed({
            viewDataBinding.dayNight?.day?.set(true)
        }, 6000)
    }
}