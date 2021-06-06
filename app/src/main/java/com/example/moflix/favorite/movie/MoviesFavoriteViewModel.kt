package com.example.moflix.favorite.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.moflix.data.source.MovieRepository
import com.example.moflix.data.source.local.entity.MoviesEntity

class MoviesFavoriteViewModel(private val movieRepository: MovieRepository): ViewModel() {

    fun getFavoriteMovies(): LiveData<List<MoviesEntity>>{
        return movieRepository.getFavoriteMovies()
    }
}