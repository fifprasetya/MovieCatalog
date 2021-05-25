package com.example.moflix.data.source

import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.data.source.remote.RemoteDataSource

class MovieRepository private constructor(private val remoteDataSource: RemoteDataSource): MovieDataSource {

    companion object{
        @Volatile
        private var instance: MovieRepository? = null

        fun getInstance(remoteData: RemoteDataSource): MovieRepository =
            instance ?: synchronized(this){
                instance ?: MovieRepository(remoteData).apply { instance = this }
            }
    }

    override fun getAllMovies(): ArrayList<MoviesEntity> {
        val movieResponses = remoteDataSource.getAllMovies()
        val movieList = ArrayList<MoviesEntity>()
        for(response in movieResponses){
            val movie = MoviesEntity(
                response.id,
                response.title,
                response.description,
                response.releaseDate,
                response.rating,
                response.imagePath
            )
            movieList.add(movie)
        }
        return movieList
    }

    override fun getAllTvshow(): ArrayList<TvshowEntity> {
        val tvshowResponses = remoteDataSource.getAllTvshow()
        val tvshowList = ArrayList<TvshowEntity>()
        for(response in tvshowResponses){
            val tvshow = TvshowEntity(
                response.id,
                response.title,
                response.description,
                response.releaseDate,
                response.rating,
                response.imagePath
            )
            tvshowList.add(tvshow)
        }
        return tvshowList
    }
}