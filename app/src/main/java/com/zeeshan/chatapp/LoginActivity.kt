package com.zeeshan.chatapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginLoginBtnClicked(view: View){

        Snackbar.make(view,"Login Button Clicked",Snackbar.LENGTH_SHORT).setAction("Action",null).show()

    }

    fun loginCreateUserBtnClicked(view: View){

        val createUserIntent = Intent(this, CreateUserActivity::class.java)
        startActivity(createUserIntent)

    }
//    fun snackBar(view: View, msg: String){
//        Snackbar.make(view, "LogIn or SignUp", Snackbar.LENGTH_SHORT).setAction("Action", null).show()
//    }
}
