package com.example.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.databinding.ChildViewBinding
import com.example.nestedrecyclerview.models.ChildModel

class ChildAdapter(private val list: ArrayList<ChildModel>) :
    RecyclerView.Adapter<ChildAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: ChildViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ChildViewBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChildAdapter.ViewHolder, position: Int) {
        holder.binding.apply {
            val _list = list[position]
            tvAns.text = _list.text
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}