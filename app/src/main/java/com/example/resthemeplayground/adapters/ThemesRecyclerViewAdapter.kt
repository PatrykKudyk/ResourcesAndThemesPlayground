package com.example.resthemeplayground.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.resthemeplayground.MainActivity
import com.example.resthemeplayground.R
import com.example.resthemeplayground.enums.ThemeEnum
import com.example.resthemeplayground.helpers.ThemeHelper
import com.example.resthemeplayground.models.Theme

class ThemesRecyclerViewAdapter(private val context: Context) :
    RecyclerView.Adapter<ThemesRecyclerViewAdapter.ThemesRecyclerViewHolder>() {

    private var items = ArrayList<Theme>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThemesRecyclerViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.listitem_theme_overview, parent, false)
        return ThemesRecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ThemesRecyclerViewHolder, position: Int) {
        holder.initViews()
        holder.setValues(items[position], position)
        holder.initListeners(position)
    }

    override fun getItemCount(): Int = items.size

    fun setRecyclerItems(givenItems: ArrayList<Theme>) {
        items = givenItems
        notifyDataSetChanged()
    }

    inner class ThemesRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private lateinit var nameTextView: TextView
        private lateinit var color1ImageView: ImageView
        private lateinit var color2ImageView: ImageView
        private lateinit var color3ImageView: ImageView
        private lateinit var color4ImageView: ImageView
        private lateinit var color5ImageView: ImageView
        private lateinit var color6ImageView: ImageView
        private lateinit var color7ImageView: ImageView
        private lateinit var clMain: ConstraintLayout

        fun initViews() {
            nameTextView = itemView.findViewById(R.id.tvThemeName)
            color1ImageView = itemView.findViewById(R.id.ivColor1)
            color2ImageView = itemView.findViewById(R.id.ivColor2)
            color3ImageView = itemView.findViewById(R.id.ivColor3)
            color4ImageView = itemView.findViewById(R.id.ivColor4)
            color5ImageView = itemView.findViewById(R.id.ivColor5)
            color6ImageView = itemView.findViewById(R.id.ivColor6)
            color7ImageView = itemView.findViewById(R.id.ivColor7)
            clMain = itemView.findViewById(R.id.clMain)
        }

        fun setValues(item: Theme, position: Int) {
            if (position == ThemeHelper.selectedThemePosition){
                clMain.setBackgroundColor(context.getColor(R.color.colorEcruDarkDark))
            } else {
                clMain.setBackgroundColor(context.getColor(R.color.colorEcru))
            }

            nameTextView.text = item.name
            if (item.colors.size >= 7) {
                color1ImageView.background = context.getDrawable(item.colors[0])
                color2ImageView.background = context.getDrawable(item.colors[1])
                color3ImageView.background = context.getDrawable(item.colors[2])
                color4ImageView.background = context.getDrawable(item.colors[3])
                color5ImageView.background = context.getDrawable(item.colors[4])
                color6ImageView.background = context.getDrawable(item.colors[5])
                color7ImageView.background = context.getDrawable(item.colors[6])
            }
        }

        fun initListeners(position: Int) {
            clMain.setOnClickListener {
                ThemeHelper.selectedThemePosition = position
                ThemeHelper.theme = ThemeEnum.valueOf(nameTextView.text.toString())
                (context as MainActivity).recreate()
            }
        }
    }
}