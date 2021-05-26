package com.example.moflix.data.source

import androidx.lifecycle.LiveData
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity

interface MovieDataSource {

    fun getAllMovies(): LiveData<List<MoviesEntity>>

    fun getAllTvshow(): LiveData<List<TvshowEntity>>

    fun getMoviesWithId(moviesId: String): LiveData<MoviesEntity>

    fun getTvshowWithId(tvshowId: String): LiveData<TvshowEntity>
}