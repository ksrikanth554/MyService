package com.sritechsoftsolutions.myservice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnstart.setOnClickListener {
            var i=Intent(this@MainActivity,Myservice::class.java)
            startService(i)
        }
        btnstop.setOnClickListener {
            var i=Intent(this@MainActivity,Myservice::class.java)
            stopService(i)
        }
    }
}
