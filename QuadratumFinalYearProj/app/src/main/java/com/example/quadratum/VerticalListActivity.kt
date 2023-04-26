
package com.example.quadratum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quadratum.adapter.ExerciseCardAdapter
import com.example.quadratum.const.Layout
import com.example.quadratum.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVerticalListBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = ExerciseCardAdapter(
            applicationContext,
            Layout.SQUARE
        )

        // Specify fixed size to improve performance
        binding.verticalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.newButton.setOnClickListener{launchActivityCreateNew()}
    }

    fun launchActivityCreateNew(){
        listIntent = Intent(this, CreateNewActivitiy::class.java)
        startActivity(listIntent)
    }
}
