
package com.example.quadratum.model

import androidx.annotation.DrawableRes

/**
 * A data class to represent the exercises
 */
data class Exercise(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val sets: String,
    val description: String
)
