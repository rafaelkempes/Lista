package com.example.lista.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lista.Film
import com.example.lista.R

class FilmAdapter(private val filmList: List<Film>):RecyclerView.Adapter<FilmViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {

        val layoutInflater=LayoutInflater.from(parent.context)
        return  FilmViewHolder(layoutInflater.inflate(R.layout.item_film,parent,false))
    }

    override fun getItemCount(): Int {
        return  filmList.size
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val item =filmList[position]
        holder.render(item)
    }
}