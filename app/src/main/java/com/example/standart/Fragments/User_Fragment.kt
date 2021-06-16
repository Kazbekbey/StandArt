package com.example.standart.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.standart.Authorization.Login
import com.example.standart.R
import kotlinx.android.synthetic.main.fragment_user.*

class User_Fragment:Fragment(R.layout.fragment_user) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    Plys.setOnClickListener {
        val intent = Intent(context, Login::class.java)
        startActivity(intent)
    }
    }
}