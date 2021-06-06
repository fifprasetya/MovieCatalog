package com.example.moflix.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity

@Dao
interface FilmDao {

    @Query("SELECT * FROM moviesentities")
    fun getMovies(): LiveData<List<MoviesEntity>>

    @Query("SELECT * FROM tvshowentities")
    fun getTvshows(): LiveData<List<TvshowEntity>>

    @Query("SELECT * FROM moviesentities where favorite = 1")
    fun getFavoriteMovie(): LiveData<List<MoviesEntity>>

    @Query("SELECT * FROM tvshowentities where favorite = 1")
    fun getFavoriteTvshow(): LiveData<List<TvshowEntity>>

    @Transaction
    @Query("SELECT * FROM moviesentities where moviesId = :moviesId")
    fun getMoviesWithId(moviesId: String): LiveData<MoviesEntity>

    @Transaction
    @Query("SELECT * FROM tvshowentities where tvshowId = :tvshowId")
    fun getTvshowWithId(tvshowId: String): LiveData<TvshowEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(movies: List<MoviesEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTvshow(tvshow: List<TvshowEntity>)

    @Update
    fun updateMovie(movie: MoviesEntity)

    @Update
    fun updateTvshow(tvshow: TvshowEntity)
}