package com.example.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.databinding.ParentViewBinding
import com.example.nestedrecyclerview.models.ParentModel

class ParentAdapter(private val parentList: ArrayList<ParentModel>) :
    RecyclerView.Adapter<ParentAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ParentViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentAdapter.ViewHolder {
        val binding = ParentViewBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ParentAdapter.ViewHolder, position: Int) {
        holder.binding.apply {
            tvQues.text = parentList[position].ques
            val childMembersAdapter = ChildAdapter(parentList[position].options)
            rvChlid.adapter = childMembersAdapter
        }
    }

    override fun getItemCount(): Int {
        return parentList.size
    }
}