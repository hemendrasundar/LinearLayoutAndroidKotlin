package com.hemendra.myapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("create","oncreate is called")
        login_btn.setOnClickListener {

            var intent = Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)

        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("start","onstart is called")

    }

    override fun onResume() {
        super.onResume()
        Log.i("resume","onresume is called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("pause","onpause is called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("stop","onstop is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Restart","onRestart is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Destroy","onDestroy is called")
    }

}