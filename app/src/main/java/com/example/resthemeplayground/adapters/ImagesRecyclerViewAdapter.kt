package com.example.resthemeplayground.adapters

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.resthemeplayground.R

class ImagesRecyclerViewAdapter(private val context: Context) :
    RecyclerView.Adapter<ImagesRecyclerViewAdapter.ImagesRecyclerViewHolder>() {

    private var imageItems = ArrayList<Drawable>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesRecyclerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.listitem_image, parent, false)
        return ImagesRecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImagesRecyclerViewHolder, position: Int) {
        holder.setImage(position)
    }

    override fun getItemCount(): Int = imageItems.size

    fun setItems(items: ArrayList<Drawable>){
        imageItems = items
    }

    inner class ImagesRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val imageView: ImageView = itemView.findViewById(R.id.mainImageView)

        fun setImage(position: Int) {
            imageView.setImageDrawable(imageItems[position])
        }

    }
}