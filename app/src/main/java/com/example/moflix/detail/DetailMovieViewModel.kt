package com.example.moflix.detail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.moflix.data.source.MovieRepository
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.utils.DataDummy

class DetailMovieViewModel(private val movieRepository: MovieRepository): ViewModel() {

    private lateinit var Id: String

    fun setSelectedId(Id: String) {
        this.Id = Id
    }

    /*fun getTvshow(): TvshowEntity {
        lateinit var tvshow: TvshowEntity
        tvshow = TvshowEntity("","","","","","")
        //val tvshowEntities = DataDummy.generateDummyTvshow()
        val tvshowEntities = movieRepository.getAllTvshow()
        for (tvshowEntitiy in tvshowEntities){
            if(tvshowEntitiy.tvshowId == Id ){
                tvshow = tvshowEntitiy
                Log.d("tvshowEntity", "data tvshow masuk")
            }
            Log.d("tvshowEntities",tvshowEntitiy.imagePath)

        }
        return tvshow
    }

    fun getMovies(): MoviesEntity {
        lateinit var movies : MoviesEntity
        movies = MoviesEntity("","","","","","")
        //val moviesEntities = DataDummy.generateDummyMovies()
        val moviesEntities = movieRepository.getAllMovies()
        for(moviesEntity in moviesEntities){
            if(moviesEntity.moviesId == Id){
                movies = moviesEntity
                Log.d("moviesEntitiy", "data movies masuk")
            }
            Log.d("moviesEntitiy", moviesEntity.imagePath)

        }
        return movies
    }

     */

    fun getTvshow(): LiveData<TvshowEntity> = movieRepository.getTvshowWithId(Id)

    fun getMovies(): LiveData<MoviesEntity> = movieRepository.getMoviesWithId(Id)

}