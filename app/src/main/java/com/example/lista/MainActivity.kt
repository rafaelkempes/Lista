package com.example.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lista.adapter.FilmAdapter
import com.example.lista.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val decoration = DividerItemDecoration(this,LinearLayoutManager.HORIZONTAL)
        //val manager = LinearLayoutManager(this)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter =FilmAdapter(FilmProvider.filmList)
        //binding.recycler.addItemDecoration(decoration)
    }
}