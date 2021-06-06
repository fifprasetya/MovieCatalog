package com.example.moflix.data.source.local

import androidx.lifecycle.LiveData
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.data.source.local.room.FilmDao

class LocalDataSource private constructor(private val mFilmDao: FilmDao){

    companion object{
        private var INSTANCE: LocalDataSource? = null

        fun getInstance(filmDao: FilmDao): LocalDataSource =
            INSTANCE ?: LocalDataSource(filmDao)
    }

    fun getAllMovies(): LiveData<List<MoviesEntity>> = mFilmDao.getMovies()

    fun getAllTvshow(): LiveData<List<TvshowEntity>> = mFilmDao.getTvshows()

    fun getFavoriteMovies(): LiveData<List<MoviesEntity>> = mFilmDao.getFavoriteMovie()

    fun getFavoriteTvshow(): LiveData<List<TvshowEntity>> = mFilmDao.getFavoriteTvshow()

    fun getMoviesWithId(moviesId: String): LiveData<MoviesEntity> =
        mFilmDao.getMoviesWithId(moviesId)

    fun getTvshowWithId(tvshowId: String): LiveData<TvshowEntity> =
        mFilmDao.getTvshowWithId(tvshowId)

    fun insertMovies(movies: List<MoviesEntity>) = mFilmDao.insertMovies(movies)

    fun insertTvshow(tvshows: List<TvshowEntity>) = mFilmDao.insertTvshow(tvshows)

    fun setMoviesFavorite(movies: MoviesEntity, newState: Boolean){
        movies.favorite = newState
        mFilmDao.updateMovie(movies)
    }

    fun setTvshowFavorite(tvshow: TvshowEntity, newState: Boolean){
        tvshow.favorite = newState
        mFilmDao.updateTvshow(tvshow)
    }
}