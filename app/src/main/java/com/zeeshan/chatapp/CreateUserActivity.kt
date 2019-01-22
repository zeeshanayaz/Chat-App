package com.zeeshan.chatapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {

    var userAvatar = "profiledefault"
    var avatarColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatar(view: View){
//        Snackbar.make(view,"Generate Avatar Button Clicked", Snackbar.LENGTH_SHORT).setAction("Action",null).show()

        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)

        if(color == 0){
            userAvatar = "light$avatar"
        }
        else{
            userAvatar = "dark$avatar"
        }

        val resourceID = resources.getIdentifier(userAvatar, "drawable", packageName)
        createAvatarImageView.setImageResource(resourceID)

        Snackbar.make(view,"Setting User Avatar $userAvatar", Snackbar.LENGTH_SHORT).setAction("Action",null).show()


    }

    fun generateBackgroundColorClicked(view: View){
//        Snackbar.make(view,"Generate Background Color Button Clicked",Snackbar.LENGTH_SHORT).setAction("Action",null).show()
        val random = Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)
        createAvatarImageView.setBackgroundColor(Color.rgb(r,g,b))
//        Converting RGB to save
        val savedR = r.toDouble() / 255
        val savedG = g.toDouble() / 255
        val savedB = b.toDouble() / 255
        avatarColor = "[$savedR, $savedG, $savedB, 1]"
        Snackbar.make(view,"Background Color: $avatarColor",Snackbar.LENGTH_SHORT).setAction("Action",null).show()

    }

    fun CreateUserBtnClicked(view: View){
        Snackbar.make(view,"Create User Button Clicked",Snackbar.LENGTH_SHORT).setAction("Action",null).show()
    }
}
