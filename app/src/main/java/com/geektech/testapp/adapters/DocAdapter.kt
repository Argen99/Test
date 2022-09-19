package com.geektech.testapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.testapp.R
import com.geektech.testapp.databinding.ItemDocumentsBinding

class DocAdapter: RecyclerView.Adapter<DocAdapter.DocViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DocViewHolder {
        return DocViewHolder(ItemDocumentsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: DocViewHolder, position: Int) {
        holder.onBind()
    }

    override fun getItemCount(): Int = 2

    inner class DocViewHolder(_binding: ItemDocumentsBinding): RecyclerView.ViewHolder(_binding.root){
        private val binding = _binding

        fun onBind(){
            binding.ivDoc.setImageResource(R.drawable.image_doc)
            binding.tvDoc.text = "Задание 1 - экраны системы измеряющей диапазон наклона"
            binding.tvDate.text = "09.07.22 11:50"
            binding.tvCount.text = "2"
        }
    }
}