
package com.example.quadratum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.quadratum.adapter.ExerciseCardAdapter
import com.example.quadratum.const.Layout
import com.example.quadratum.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = ExerciseCardAdapter(
            applicationContext,
            Layout.GRID
        )



        // Specify fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
         supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.previewView.setOnClickListener{setPreview()}
        binding.exerciseImage.setOnClickListener { clickTest2() }


        binding.gridRecyclerView.setOnClickListener { clickTest2() }

    }

    private fun setPreview(){
        val text = "Test"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
         toast.show()
    }

    private fun clickTest2(){
        val text = "clickTest2"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
}
//this doesnt work
private fun RecyclerView.addOnItemTouchListener() {
    val text = "ItemTouchListener"
    val duration = Toast.LENGTH_SHORT
    val toast = Toast.makeText(context, text, duration)
    toast.show()
}
