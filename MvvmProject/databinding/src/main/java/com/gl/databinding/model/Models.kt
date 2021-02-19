package com.example.administrator.databindingapp.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField

data class Teacher(var name: String, var age: Int)

data class Student(var name: String?, var age: Int)

data class Course(val course: HashMap<String, Teacher>)

data class Teacher2(var name: ObservableField<String>?, var age: ObservableField<Int>?)

data class ShowHide(var sh: ObservableBoolean)

data class DayNight(var day: ObservableBoolean)

class Teacher3 : BaseObservable() {
    var name: String? = null
        @Bindable
        get() = field
        set(value) {
            field = value
//            notifyPropertyChanged(BR.name)
        }
    var age: Int? = null
        @Bindable
        get() = field
        set(value) {
            field = value
//            notifyPropertyChanged(BR.age)
        }
}