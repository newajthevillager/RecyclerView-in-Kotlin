package com.example.recyclerviewappkotlin.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewappkotlin.R
import com.example.recyclerviewappkotlin.models.Animal
import kotlinx.android.synthetic.main.activity_animal_details.*

class AnimalDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_details)

        var animal = intent.getSerializableExtra(getString(R.string.animalKey)) as Animal
        ivAnimalDetailsId.setImageResource(animal.image)
        tvIdAnimalName.text = animal.name
    }
}
