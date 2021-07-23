package com.example.recyclerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val adapter = ChatAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = LinearLayoutManager(this)

        binding.button.setOnClickListener {
            val str = binding.editTextTextPersonName.text.toString().trim()
            if (str.isBlank()) return@setOnClickListener

            addChat(str)
            binding.editTextTextPersonName.setText("")

        }

        setContentView(binding.root)
    }

    fun addChat(str: String) {
        adapter.list.add(str)
        adapter.notifyItemChanged(adapter.list.size - 1)
    }
}