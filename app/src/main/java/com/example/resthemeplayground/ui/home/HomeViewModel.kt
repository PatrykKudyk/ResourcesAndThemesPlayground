package com.example.resthemeplayground.ui.home

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.resthemeplayground.adapters.ThemesRecyclerViewAdapter
import com.example.resthemeplayground.databinding.FragmentHomeBinding
import com.example.resthemeplayground.helpers.ThemeHelper

class HomeViewModel : ViewModel() {

    lateinit var recyclerAdapter: ThemesRecyclerViewAdapter

    fun initRecycler(binding: FragmentHomeBinding, context: Context) {
        recyclerAdapter = ThemesRecyclerViewAdapter(context)
        binding.themesRecycler.layoutManager = LinearLayoutManager(context)
        binding.themesRecycler.adapter = recyclerAdapter
        recyclerAdapter.setRecyclerItems(ThemeHelper().getThemesList())
    }
}