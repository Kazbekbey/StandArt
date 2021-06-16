package com.example.standart.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.standart.R
import kotlinx.android.synthetic.main.activity_item.view.*

class Adapter(): RecyclerView.Adapter<Adapter.ViewHolderUi>() {
    var model:List<Model> = listOf()
    inner class ViewHolderUi(itemView:View):RecyclerView.ViewHolder(itemView){
        fun populateUnit(unit: Model) {
            itemView.text.text = unit.xtext
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderUi {
        val activity_mainView: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_item, parent,false)
        return  ViewHolderUi(activity_mainView)
    }

    override fun onBindViewHolder(holder: ViewHolderUi, position: Int) {
        return holder.populateUnit(model[position])
    }

    override fun getItemCount(): Int {
        return  model.size
    }
}