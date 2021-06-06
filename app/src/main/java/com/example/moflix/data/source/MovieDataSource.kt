package com.example.moflix.data.source

import androidx.lifecycle.LiveData
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.vo.Resource

interface MovieDataSource {

    fun getAllMovies(): LiveData<Resource<List<MoviesEntity>>>

    fun getAllTvshow(): LiveData<Resource<List<TvshowEntity>>>

    fun getMoviesWithId(moviesId: String): LiveData<Resource<MoviesEntity>>

    fun getTvshowWithId(tvshowId: String): LiveData<Resource<TvshowEntity>>

    fun getFavoriteMovies(): LiveData<List<MoviesEntity>>

    fun getFavoriteTvshow(): LiveData<List<TvshowEntity>>

    fun setMovieFavorite(movie: MoviesEntity, state: Boolean)

    fun setTvshowFavorite(tvshow: TvshowEntity, state: Boolean)
}