package com.example.moflix.detail

import androidx.lifecycle.ViewModel
import com.example.moflix.data.MoviesEntity
import com.example.moflix.data.TvshowEntity
import com.example.moflix.utils.DataDummy

class DetailMovieViewModel: ViewModel() {

    private lateinit var Id: String

    fun setSelectedId(Id: String) {
        this.Id = Id
    }

    fun getTvshow(): TvshowEntity{
        lateinit var tvshow: TvshowEntity
        tvshow = TvshowEntity("","","","","",0)
        val tvshowEntities = DataDummy.generateDummyTvshow()
        for (tvshowEntitiy in tvshowEntities){
            if(tvshowEntitiy.tvshowId == Id ){
                tvshow = tvshowEntitiy
            }
        }
        return tvshow
    }

    fun getMovies(): MoviesEntity{
        lateinit var movies : MoviesEntity
        movies = MoviesEntity("","","","","",0)
        val moviesEntities = DataDummy.generateDummyMovies()
        for(moviesEntity in moviesEntities){
            if(moviesEntity.moviesId == Id){
                movies = moviesEntity
            }
        }
        return movies
    }


}