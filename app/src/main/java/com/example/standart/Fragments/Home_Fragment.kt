package com.example.standart.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.standart.R
import com.example.standart.ui.Adapter
import com.example.standart.ui.Model
import kotlinx.android.synthetic.main.fragment_home.*

class Home_Fragment:Fragment(R.layout.fragment_home) {
    private val adapter1 = Adapter()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        unitsRecyclerView_2.adapter = adapter1
        unitsRecyclerView_2.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        setData()

    }

    private fun setData () {
        val models :MutableList<Model> = mutableListOf()
        for (i in 0 until  100){
            val model: Model = Model()
            model.xtext = "This is text ${i}"
            models.add(model)
        }
        adapter1.model =models
    }
}