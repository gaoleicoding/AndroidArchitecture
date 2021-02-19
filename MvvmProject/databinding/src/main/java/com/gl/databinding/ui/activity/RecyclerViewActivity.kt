package com.example.administrator.databindingapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.example.administrator.databindingapp.model.Teacher2
import com.example.administrator.databindingapp.ui.adapter.RecyclerViewAdapter
import com.gl.databinding.R
import com.gl.databinding.databinding.ActivityRecyclerviewBinding

class RecyclerViewActivity : AppCompatActivity() {

    val teacher2: ArrayList<Teacher2> by lazy {
        ArrayList<Teacher2>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewDataBinding = DataBindingUtil.setContentView<ActivityRecyclerviewBinding>(this, R.layout.activity_recyclerview)
        viewDataBinding.adapter = RecyclerViewAdapter(teacher2)

        for (i in 0..30) {
            teacher2.add(Teacher2(ObservableField("Hello$i"), ObservableField(i)))
        }
        viewDataBinding.adapter?.notifyDataSetChanged()
    }
}