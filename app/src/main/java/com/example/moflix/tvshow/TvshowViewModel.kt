package com.example.moflix.tvshow

import androidx.lifecycle.ViewModel
import com.example.moflix.data.source.MovieRepository
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.utils.DataDummy

class TvshowViewModel(private val movieRepository: MovieRepository): ViewModel() {

    //fun getTvshows(): List<TvshowEntity> = DataDummy.generateDummyTvshow()

    fun getTvshows(): List<TvshowEntity> = movieRepository.getAllTvshow()
}