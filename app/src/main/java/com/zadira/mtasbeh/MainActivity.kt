package com.zadira.mtasbeh

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.content.SharedPreferences.Editor




class MainActivity : AppCompatActivity() {
    val array=ArrayList<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyShafePreferens.init(this)
        save.setOnClickListener {
            val name=name.text.toString()
            val surname=sur.text.toString()
            val age=age.text.toString()
            val user=User(name,surname,age)
            if (name!="" && surname!="" && age!=""){
                array.add(user)
                MyShafePreferens.objectsString=array
            }
            startActivity(Intent(this,Second::class.java))




        }
        next.setOnClickListener {
        }



    }
}
