package com.example.resthemeplayground.ui.dashboard

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.resthemeplayground.adapters.ImagesRecyclerViewAdapter
import com.example.resthemeplayground.databinding.FragmentDashboardBinding
import com.example.resthemeplayground.helpers.ImagesHelper

class DashboardViewModel : ViewModel() {
    private lateinit var recyclerAdapter: ImagesRecyclerViewAdapter

    fun initRecyclerView(binding: FragmentDashboardBinding, context: Context) {
        recyclerAdapter = ImagesRecyclerViewAdapter(context)
        binding.recyclerView.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerView.adapter = recyclerAdapter
        recyclerAdapter.setItems(ImagesHelper().getImagesList(context))
    }
}