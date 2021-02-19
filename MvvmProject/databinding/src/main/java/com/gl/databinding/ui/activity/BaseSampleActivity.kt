package com.example.administrator.databindingapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.administrator.databindingapp.model.Course
import com.example.administrator.databindingapp.model.Student
import com.example.administrator.databindingapp.model.Teacher
import com.gl.databinding.R
import com.gl.databinding.databinding.ActivityBasesampleBinding

class BaseSampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewDataBinding = DataBindingUtil.setContentView<ActivityBasesampleBinding>(this, R.layout.activity_basesample)
        viewDataBinding.teacher = Teacher("renyu", 30)
        viewDataBinding.student = Student("PQ", 28)
        val maps = HashMap<String, Teacher>()
        maps["renyu"] = Teacher("renyu", 30)
        val course = Course(maps)
        viewDataBinding.courses = course

//        Handler().postDelayed({
//            viewDataBinding.teacher?.age = 31
//        }, 5000)
    }
}