package com.example.resthemeplayground.helpers

import android.content.Context
import android.graphics.drawable.Drawable
import com.example.resthemeplayground.R
import kotlin.random.Random

class ImagesHelper {

    fun getImagesList(context: Context): ArrayList<Drawable> {
        val imagesList = ArrayList<Drawable>()
        for (i in 0..100){
            val random = Random.nextInt(0, 20)
            imagesList.add(getImagesAsDrawable(random, context))
        }
        return imagesList
    }

    private fun getImagesAsDrawable(number: Int, context: Context): Drawable{
        return when(number){
            in 0..6 -> context.getDrawable(R.drawable.dead_poets4)!!
            in 7..11 -> context.getDrawable(R.drawable.dead_poets1)!!
            in 12..15 -> context.getDrawable(R.drawable.dead_poets2)!!
            else -> context.getDrawable(R.drawable.dead_poets3)!!
        }
    }
}