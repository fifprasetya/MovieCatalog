package com.example.moflix.data.source.remote

import com.example.moflix.data.source.remote.response.MoviesResponse
import com.example.moflix.data.source.remote.response.TvshowResponse
import com.example.moflix.utils.JsonHelper

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper){
    companion object{
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this){
                instance ?: RemoteDataSource(helper).apply { instance = this }
            }
    }

    fun getAllMovies(): List<MoviesResponse> = jsonHelper.loadMovies()

    fun getAllTvshow(): List<TvshowResponse> = jsonHelper.loadTvshow()
}