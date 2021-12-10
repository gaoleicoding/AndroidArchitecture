package com.gl.databinding.ui.activity

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import com.gl.databinding.model.ShowHide
import com.gl.databinding.model.Teacher2
import com.gl.databinding.R
import com.gl.databinding.databinding.ActivityEdittextBinding

class EditTextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewDataBinding = DataBindingUtil.setContentView<ActivityEdittextBinding>(this, R.layout.activity_edittext)
        viewDataBinding.teacher2 = Teacher2(ObservableField(""), ObservableField(0))
        viewDataBinding.showhide = ShowHide(ObservableBoolean(true))

        Handler().postDelayed({
//            viewDataBinding.showhide?.sh?.set(false)

            val value = viewDataBinding.showhide?.sh?.get()
            Toast.makeText(this@EditTextActivity, "参考值为$value", Toast.LENGTH_LONG).show()
        }, 5000)
    }
}