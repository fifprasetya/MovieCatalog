package com.example.moflix.detail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.moflix.data.source.MovieRepository
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.utils.DataDummy
import com.example.moflix.vo.Resource

class DetailMovieViewModel(private val movieRepository: MovieRepository): ViewModel() {

    val Id = MutableLiveData<String>()

    fun setSelectedId(Id: String) {
        this.Id.value = Id
    }

    var moviesData: LiveData<Resource<MoviesEntity>> = Transformations.switchMap(Id){ mMoviesId ->
        movieRepository.getMoviesWithId(mMoviesId)
    }

    var tvshowData: LiveData<Resource<TvshowEntity>> = Transformations.switchMap(Id){ mTvshowId ->
        movieRepository.getTvshowWithId(mTvshowId)
    }



    fun setFavoriteMovie(){
        val moviesResource = moviesData.value
        if (moviesResource != null){
            val moviesWithId = moviesResource.data

            if(moviesWithId != null){
                val newState = !moviesWithId.favorite
                movieRepository.setMovieFavorite(moviesWithId, newState)
            }
        }
    }

    fun setFavoriteTvshow(){
        val tvshowResource = tvshowData.value
        if(tvshowResource != null){
            val tvshowWithId = tvshowResource.data
            if(tvshowWithId != null){
                val newState = !tvshowWithId.favorite
                movieRepository.setTvshowFavorite(tvshowWithId, newState)
            }
        }
    }

    val DataV = tvshowData.value
    val mDatam = DataV?.data
    val DataM = moviesData.value
    val vDatam = DataM?.data
    fun getTvshow(): LiveData<Resource<TvshowEntity>> = movieRepository.getTvshowWithId(mDatam!!.tvshowId)

    fun getMovies(): LiveData<Resource<MoviesEntity>> = movieRepository.getMoviesWithId(vDatam!!.moviesId)

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