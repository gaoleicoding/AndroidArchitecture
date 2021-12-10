package com.gl.databinding.ui.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.databinding.InverseBindingListener
import androidx.databinding.InverseBindingMethod
import androidx.databinding.InverseBindingMethods

@InverseBindingMethods(InverseBindingMethod(type = VisibleView2::class, attribute = "displayShow"))
class VisibleView2 : View {
    constructor(context: Context) : super(context)
    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet)

    var listener: OnChangeListener? = null

    var temp = false

    interface OnChangeListener {
        fun change()
    }

    override fun onVisibilityChanged(changedView: View, visibility: Int) {
        super.onVisibilityChanged(changedView, visibility)
        listener?.change()
    }

    fun setDisplayShow(boolean: Boolean) {
        if (boolean) {
            this.visibility = VISIBLE
        } else {
            this.visibility = GONE
        }
    }

    fun getDisplayShow(): Boolean {
        return this.temp
    }

    fun setDisplayShowAttrChanged(inverseBindingListener: InverseBindingListener) {
        this.listener = object : OnChangeListener {
            override fun change() {
                this@VisibleView2.temp = this@VisibleView2.visibility == View.VISIBLE
                inverseBindingListener.onChange()
            }
        }
    }
}