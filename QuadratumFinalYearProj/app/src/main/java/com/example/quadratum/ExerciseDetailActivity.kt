package com.example.quadratum

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.quadratum.databinding.ActivityMainBinding
import com.example.quadratum.model.Exercise


class ExerciseDetailActivity : AppCompatActivity() {

   private lateinit var binding: ActivityMainBinding
   private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_detail)

        val intent = intent
        val imageID : Int = intent.getIntExtra("imageID", 0) as Int
        val name: String = intent.getSerializableExtra("name") as String
        val sets : String = intent.getStringExtra("sets") as String
        val description: String = intent.getStringExtra("description") as String


        val imageView : ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(imageID)

        val nameView : TextView = findViewById(R.id.nameView)
        nameView.text = name

        val setView : TextView = findViewById(R.id.setView)
        setView.text = sets

        val descriptionView : TextView = findViewById(R.id.descriptionView)
        descriptionView.text = description

    }
}