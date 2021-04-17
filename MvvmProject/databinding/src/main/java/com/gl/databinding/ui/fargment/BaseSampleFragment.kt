package com.gl.databinding.ui.fargment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.Observable
import androidx.databinding.OnRebindCallback
import androidx.fragment.app.Fragment
import com.gl.databinding.model.Teacher
import com.gl.databinding.R
import com.gl.databinding.databinding.ActivityBasesampleBinding

class BaseSampleFragment : Fragment() {

    val teacher: Teacher by lazy {
        Teacher("renyu", 31)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val viewDataBinding = DataBindingUtil.inflate<ActivityBasesampleBinding>(inflater, R.layout.activity_basesample, container, false)
        viewDataBinding.addOnRebindCallback(object : OnRebindCallback<ActivityBasesampleBinding>() {
            override fun onBound(binding: ActivityBasesampleBinding?) {
                super.onBound(binding)
                Log.d(this@BaseSampleFragment::class.simpleName, "onBound")
            }

            override fun onCanceled(binding: ActivityBasesampleBinding?) {
                super.onCanceled(binding)
                Log.d(this@BaseSampleFragment::class.simpleName, "onCanceled")
            }

            override fun onPreBind(binding: ActivityBasesampleBinding?): Boolean {
                Log.d(this@BaseSampleFragment::class.simpleName, "onPreBind")
                return super.onPreBind(binding)
            }
        })
        viewDataBinding.addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback() {
            override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
                Log.d(this@BaseSampleFragment::class.simpleName, "$propertyId")
            }
        })
        viewDataBinding.teacher = teacher
        return viewDataBinding.root
    }
}