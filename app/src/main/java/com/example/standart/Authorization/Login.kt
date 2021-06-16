package com.example.standart.Authorization

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.standart.Fragments.Home_Fragment
import com.example.standart.Fragments.User_Fragment
import com.example.standart.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    private val mAuth =FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login.setOnClickListener {
            if (username.text.isNotEmpty() && password.text.isNotEmpty()){
                loading.visibility = View.VISIBLE
                mAuth.signInWithEmailAndPassword(username.text.toString() ,password.text.toString())
                        .addOnCompleteListener {
                            if(it.isSuccessful){
                                loading.visibility=View.GONE
                                val currentUser =mAuth.currentUser
                                updateUi(currentUser)
                            }else{
                                loading.visibility=View.GONE
                                Toast.makeText(this ,"Нет такого аккаунта" , Toast.LENGTH_LONG).show()
                            }
                        }
            }else{
                Toast.makeText(this,"Запоните строки" , Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        val currentUser =mAuth.currentUser
        updateUi(currentUser)
    }
    private fun updateUi (user: FirebaseUser?){
    if (user!= null) {
        val intent =Intent(this ,Home_Fragment::class.java)
        startActivity(intent)
    }
    }
}