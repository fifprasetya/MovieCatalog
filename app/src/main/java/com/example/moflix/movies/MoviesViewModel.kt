package com.example.moflix.movies

import androidx.lifecycle.ViewModel
import com.example.moflix.data.source.MovieRepository
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.utils.DataDummy

class MoviesViewModel(private val moviesRepository: MovieRepository): ViewModel() {

    //fun getMovies(): List<MoviesEntity> = DataDummy.generateDummyMovies()

    fun getMovies(): List<MoviesEntity> = moviesRepository.getAllMovies()
}