package com.gl.databinding.ui.activity

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.gl.databinding.impl.ClickEventImpl
import com.gl.databinding.util.MyHandlers
import com.gl.databinding.R
import com.gl.databinding.databinding.ActivityEventsampleBinding

class EventSampleActivity : AppCompatActivity(), ClickEventImpl {
    override fun clickEvent(view: View, string: String) {
        Toast.makeText(view.context, "EventSampleActivity : $string", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewDataBinding = DataBindingUtil.setContentView<ActivityEventsampleBinding>(this, R.layout.activity_eventsample)
        viewDataBinding.handlers = MyHandlers()
        viewDataBinding.impl = this
    }
}