package com.example.recyclerviewappkotlin.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewappkotlin.R
import com.example.recyclerviewappkotlin.adapters.AnimalAdapter
import com.example.recyclerviewappkotlin.adapters.AnimalAdapter.OnItemClickListener
import com.example.recyclerviewappkotlin.models.Animal
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnItemClickListener {

    lateinit var recyclerView: RecyclerView

    override fun onItemClick(animal: Animal) {
        var intent = Intent(this, AnimalDetails::class.java)
        intent.putExtra(getString(R.string.animalKey), animal)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data : List<Animal> = arrayListOf(
            Animal("Cat", R.mipmap.cat), Animal("Tiger", R.mipmap.tiger),
            Animal("Lion", R.mipmap.lion), Animal("Elephant", R.mipmap.elephant),
            Animal("Parrot", R.mipmap.parrot), Animal("Python", R.mipmap.python),
            Animal("Dog", R.mipmap.dog), Animal("Cow", R.mipmap.cow),
            Animal("Fish", R.mipmap.fish), Animal("Ant", R.mipmap.ant),
            Animal("Hen", R.mipmap.hen),
            Animal("Cat", R.mipmap.cat), Animal("Tiger", R.mipmap.tiger),
            Animal("Lion", R.mipmap.lion), Animal("Elephant", R.mipmap.elephant),
            Animal("Parrot", R.mipmap.parrot), Animal("Python", R.mipmap.python),
            Animal("Dog", R.mipmap.dog), Animal("Cow", R.mipmap.cow),
            Animal("Fish", R.mipmap.fish), Animal("Ant", R.mipmap.ant),
            Animal("Hen", R.mipmap.hen)
        )

        recyclerView = findViewById(R.id.rvAnimalsId)

        var layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        var adapter = AnimalAdapter(this, data, this)
        recyclerView.adapter = adapter

    }

}
