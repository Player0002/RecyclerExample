package com.example.recyclerexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerexample.databinding.LayoutChatItemBinding

class ChatAdapter : RecyclerView.Adapter<ChatAdapter.ChatHolder>() {
    inner class ChatHolder(private val binding : LayoutChatItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(str : String) {
            binding.textView.text = str
        }
    }

    val list = ArrayList<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LayoutChatItemBinding.inflate(inflater, parent, false)
        return ChatHolder(binding)
    }

    override fun onBindViewHolder(holder: ChatHolder, position: Int)
    {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}