package com.example.administrator.databindingapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.administrator.databindingapp.model.Teacher2
import com.example.administrator.databindingapp.util.MyHandlers
import com.gl.databinding.databinding.AdapterRecyclerviewBinding

class RecyclerViewAdapter(private val teachers: ArrayList<Teacher2>) : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerViewHolder {
        val viewDataBinding = DataBindingUtil.inflate<AdapterRecyclerviewBinding>(LayoutInflater.from(p0.context), R.layout.adapter_recyclerview, p0, false)
        return RecyclerViewHolder(viewDataBinding)
    }

    override fun getItemCount() = teachers.size

    override fun onBindViewHolder(p0: RecyclerViewHolder, p1: Int) {
        p0.dataBinding?.setVariable(BR.teacher, teachers[p1])
        p0.dataBinding?.setVariable(BR.handlers, MyHandlers())
        p0.dataBinding?.executePendingBindings()
    }

    class RecyclerViewHolder(viewDataBinding: ViewDataBinding) : RecyclerView.ViewHolder(viewDataBinding.root) {
        var dataBinding: ViewDataBinding? = viewDataBinding
    }
}