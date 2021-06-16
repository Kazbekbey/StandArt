package com.example.standart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.standart.Authorization.Login
import com.example.standart.Fragments.*
import com.example.standart.bottom_navigaton.HomeActivity
import com.example.standart.ui.Adapter
import com.example.standart.ui.Model
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_user.*

class MainActivity : AppCompatActivity() {
    private  val mAuth = FirebaseFirestore.getInstance()
    private  val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bottomNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.homeMenuItem -> {
                    supportFragmentManager.beginTransaction().replace(R.id.Container_Fragment, Home_Fragment()).commit()
                    true
                }
                R.id.addMenuItem -> {
                    supportFragmentManager.beginTransaction().replace(R.id.Container_Fragment, Add_Fragment()).commit()
                    true
                }
                R.id.searchMenuItem -> {
                    supportFragmentManager.beginTransaction().replace(R.id.Container_Fragment, Search_Fragment()).commit()
                    true
                }
                R.id.messageMenuItem-> {
                    supportFragmentManager.beginTransaction().replace(R.id.Container_Fragment, Message_Fragment()).commit()
                    true
                }
                R.id.userMenuItem -> {
                    supportFragmentManager.beginTransaction().replace(R.id.Container_Fragment, User_Fragment()).commit()
                    true
                }
                else -> false
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.Container_Fragment, Home_Fragment()).commit()
    db.collection("users").document(mAuth.currentUser?.uid!!)

    }
}
