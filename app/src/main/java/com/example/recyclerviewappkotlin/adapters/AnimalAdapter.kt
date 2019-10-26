package com.example.recyclerviewappkotlin.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewappkotlin.R
import com.example.recyclerviewappkotlin.models.Animal
import kotlinx.android.synthetic.main.single_row_animals.view.*

class AnimalAdapter (var context : Context, var animalsList : List<Animal>, val itemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.single_row_animals, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return animalsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(animalsList[position], itemClickListener)
    }


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun setData (animal : Animal, clickListener: OnItemClickListener) {
            itemView.tvAnimalId.text = animal.name
            itemView.ivAnimalId.setImageResource(animal.image)
            itemView.setOnClickListener {
                clickListener.onItemClick(animal)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(animal : Animal)
    }

}