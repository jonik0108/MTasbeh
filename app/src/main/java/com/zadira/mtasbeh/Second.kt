package com.zadira.mtasbeh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Second : AppCompatActivity() {
    var array=ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        MyShafePreferens.init(this)
        array=MyShafePreferens.objectsString
        Toast.makeText(applicationContext, "$array", Toast.LENGTH_SHORT).show()
    }
}