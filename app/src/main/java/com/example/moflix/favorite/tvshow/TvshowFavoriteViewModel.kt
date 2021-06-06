package com.example.moflix.favorite.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.moflix.data.source.MovieRepository
import com.example.moflix.data.source.local.entity.TvshowEntity

class TvshowFavoriteViewModel(private val movieRepository: MovieRepository): ViewModel() {

    fun getFavoriteTvshow(): LiveData<List<TvshowEntity>>{
        return movieRepository.getFavoriteTvshow()
    }
}