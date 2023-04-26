
package com.example.quadratum

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.quadratum.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Setup view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Launch the GridListActivity on gridBtn click
        binding.gridBtn.setOnClickListener { launchGrid() }

        binding.squareBtn.setOnClickListener{launchVertical()}


      //  binding.toastBtn.setOnClickListener { toastTest() }

        // Set a OnSeekBarChangeListener for the seek bar
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // Create a rotation animation for the image view based on the current progress of the seek bar
                val rotateAnimation = ObjectAnimator.ofFloat(binding.spinImageView, View.ROTATION_Y, progress.toFloat())

                // Set the duration and interpolator for the animation
                rotateAnimation.duration = 0 // no duration
                rotateAnimation.interpolator = LinearInterpolator()

                // Start the animation
                rotateAnimation.start()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // Do nothing
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // Do nothing
            }
        })
        // Set a OnSeekBarChangeListener for the seek bar
        binding.seekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // Create a rotation animation for the image view based on the current progress of the seek bar
                val rotateAnimation = ObjectAnimator.ofFloat(binding.spinImageView, View.ROTATION_X, progress.toFloat())

                // Set the duration and interpolator for the animation
                rotateAnimation.duration = 0 // no duration
                rotateAnimation.interpolator = LinearInterpolator()

                // Start the animation
                rotateAnimation.start()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // Do nothing
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // Do nothing
            }
        })
    }

    //function associated with the launchvertical button
    private fun launchVertical() {
        listIntent = Intent(this, VerticalListActivity::class.java)
        startActivity(listIntent)
    }


    //function to launch grid
    private fun launchGrid() {
        listIntent = Intent(this, GridListActivity::class.java)
        startActivity(listIntent)
    }

    private fun toastTest(){
        val text = "ToastTest"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext,text,duration)
        toast.show()


        binding.spinImageView.rotationX += 10.0F

    }

}
