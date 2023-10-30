package com.example.lista.adapter


import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lista.Film
import com.example.lista.databinding.ItemFilmBinding

class FilmViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val binding = ItemFilmBinding.bind(view)
    fun render(filmMode: Film){
        binding.FilmName.text = filmMode.film
        binding.FilmDirector.text =filmMode.director
        binding.FilmYear.text =filmMode.year.toString()
        Glide.with(binding.FilmPhoto.context).load(filmMode.photo).into(binding.FilmPhoto)

        binding.FilmPhoto.setOnClickListener{Toast.makeText(binding.FilmPhoto.context,filmMode.film,Toast.LENGTH_SHORT).show()}

        itemView.setOnClickListener{Toast.makeText(binding.FilmPhoto.context,filmMode.film,Toast.LENGTH_LONG).show()}
    }
}