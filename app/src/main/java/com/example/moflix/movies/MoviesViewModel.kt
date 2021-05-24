package com.example.moflix.movies

import androidx.lifecycle.ViewModel
import com.example.moflix.data.MoviesEntity
import com.example.moflix.utils.DataDummy

class MoviesViewModel: ViewModel() {

    fun getMovies(): List<MoviesEntity> = DataDummy.generateDummyMovies()
}