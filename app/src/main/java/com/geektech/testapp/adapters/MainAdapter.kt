package com.geektech.testapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.testapp.R
import com.geektech.testapp.databinding.ItemsBinding

class MainAdapter: RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(ItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.onBind()
    }

    override fun getItemCount(): Int = 8

    inner class MainViewHolder(_binding: ItemsBinding): RecyclerView.ViewHolder(_binding.root){
        private val binding = _binding

        fun onBind() {
            binding.ivItem.setImageResource(R.drawable.ic_item)
            binding.tvItem.text = "Умное сканирование"
        }
    }
}