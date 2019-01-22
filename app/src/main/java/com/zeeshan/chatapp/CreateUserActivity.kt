package com.zeeshan.chatapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View

class CreateUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatar(view: View){
        Snackbar.make(view,"Generate Avatar Button Clicked", Snackbar.LENGTH_SHORT).setAction("Action",null).show()
    }

    fun generateBackgroundColorClicked(view: View){
        Snackbar.make(view,"Generate Background Color Button Clicked",Snackbar.LENGTH_SHORT).setAction("Action",null).show()
    }

    fun CreateUserBtnClicked(view: View){
        Snackbar.make(view,"Create User Button Clicked",Snackbar.LENGTH_SHORT).setAction("Action",null).show()
    }
}
