package com.example.standart.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.standart.R
import com.google.firebase.firestore.FirebaseFirestore




class ProfileFragment:Fragment(R.layout.fragment_user) {
  private  val db = FirebaseFirestore.getInstance()
    private  val mAuth =FirebaseFirestore.getInstance()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    db.collection()
    }
}