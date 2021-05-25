package com.example.moflix.data.source

import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity

interface MovieDataSource {

    fun getAllMovies(): List<MoviesEntity>

    fun getAllTvshow(): List<TvshowEntity>
}