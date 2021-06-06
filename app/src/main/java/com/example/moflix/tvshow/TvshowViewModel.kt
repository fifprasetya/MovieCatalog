package com.example.moflix.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.moflix.data.source.MovieRepository
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.utils.DataDummy
import com.example.moflix.vo.Resource

class TvshowViewModel(private val movieRepository: MovieRepository): ViewModel() {

    //fun getTvshows(): List<TvshowEntity> = DataDummy.generateDummyTvshow()

    fun getTvshows(): LiveData<Resource<List<TvshowEntity>>> = movieRepository.getAllTvshow()
}