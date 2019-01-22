package com.zeeshan.chatapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_splash_screen.*
import java.lang.Exception

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val background = object : Thread(){
            override fun run() {
                try {
                    for (progress in 1..3){
                        Thread.sleep(1000)
                        progressBar.setProgress(progress)
                    }

                    val activityMainIntent = Intent(baseContext, MainActivity::class.java)
                    startActivity(activityMainIntent)
                }
                catch (e: Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}
