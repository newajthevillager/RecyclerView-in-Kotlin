package com.example.recyclerviewappkotlin.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewappkotlin.R
import com.example.recyclerviewappkotlin.adapters.AnimalAdapter
import com.example.recyclerviewappkotlin.adapters.AnimalAdapter.OnItemClickListener
import com.example.recyclerviewappkotlin.models.Animal
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnItemClickListener {

    override fun onItemClick(animal: Animal) {
        var intent = Intent(this, AnimalDetails::class.java)
        Toast.makeText(this,"Animal name ${animal.name}",Toast.LENGTH_LONG).show()
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data : List<Animal> = arrayListOf(
            Animal("Cat", R.drawable.cat), Animal("Tiger", R.drawable.tiger),
            Animal("Lion", R.drawable.lion), Animal("Elephant", R.drawable.elephant),
            Animal("Parrot", R.drawable.parrot), Animal("Python", R.drawable.python),
            Animal("Dog", R.drawable.dog), Animal("Cow", R.drawable.cow),
            Animal("Fish", R.drawable.fish), Animal("Ant", R.drawable.ant),
            Animal("Hen", R.drawable.hen)
        )

        var layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        rvAnimalsId.layoutManager = layoutManager

        var adapter = AnimalAdapter(this, data, this)
        rvAnimalsId.adapter = adapter

    }

}
