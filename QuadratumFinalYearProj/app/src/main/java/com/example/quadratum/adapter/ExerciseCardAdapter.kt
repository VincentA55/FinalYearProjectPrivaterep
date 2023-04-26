
package com.example.quadratum.adapter

import android.R.attr.data
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quadratum.ExerciseDetailActivity
import com.example.quadratum.R
import com.example.quadratum.model.Exercise


/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class ExerciseCardAdapter(
    private val context: Context?,
    private var layout: Int
): RecyclerView.Adapter<ExerciseCardAdapter.ExerciseCardViewHolder>() {

    object DataSource{
        val exercises: List<Exercise> = com.example.quadratum.data.DataSource.exercises
    }
    /**
     * Initialize view elements
     */
    class ExerciseCardViewHolder(view: View): RecyclerView.ViewHolder(view) {
        // Declare and initialize all of the list item UI components
        val imageView: ImageView = view.findViewById(R.id.exercise_image)
        val nameView: TextView = view.findViewById(R.id.exercise_name)
        val setView: TextView = view.findViewById(R.id.exercise_sets)
        val exerciseView: TextView = view.findViewById(R.id.exercise_description)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseCardViewHolder {
        val layoutType = if (layout == 3) {
            R.layout.grid_list_item
        }else if (layout == 4){
            R.layout.grid_square_item
        }
        else{
            R.layout.vertical_horizontal_list_item
        }


        val adapterLayout = if (layout==3) {
            LayoutInflater.from(parent.context).inflate(layoutType, parent, false)
        }
        else{
            LayoutInflater.from(parent.context).inflate(com.example.quadratum.R.layout.vertical_horizontal_list_item,parent,false)
        }
        return ExerciseCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = com.example.quadratum.data.DataSource.exercises.size //return the size of the data set 

    override fun onBindViewHolder(holder: ExerciseCardViewHolder, position: Int) {
        //  Get the data at the current position
        val item = DataSource.exercises[position]
        // Set the image resource for the current exercise
        holder.imageView.setImageResource(item.imageResourceId)
        // Set the text for the current exercise name
        holder.nameView.text = item.name
        //  Set the text for the current exercise age
        holder.setView.text = item.sets
        // Set the text for the current exercise by passing it to the
        //  R.string.exercise_description string constant.
        val resources = context?.getString(R.string.exercise_description,item.description)
        holder.exerciseView.text = resources

        holder.imageView.setOnClickListener(View.OnClickListener { v ->
            val intent = Intent(v.context, ExerciseDetailActivity::class.java)
           //Passes the data from the Exercise "item" into the next activity
            intent.putExtra("imageID",item.imageResourceId)
            intent.putExtra("name", item.name)
            intent.putExtra("sets", item.sets)
            intent.putExtra("description",item.description)


            v.context.startActivity(intent)
        })
    }
}

