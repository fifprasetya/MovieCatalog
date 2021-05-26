package com.example.moflix.data.source

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.data.source.remote.RemoteDataSource
import com.example.moflix.data.source.remote.response.MoviesResponse
import com.example.moflix.data.source.remote.response.TvshowResponse

class FakeMovieRepository (private val remoteDataSource: RemoteDataSource): MovieDataSource {


    override fun getAllMovies(): LiveData<List<MoviesEntity>> {
        val movieResults = MutableLiveData<List<MoviesEntity>>()
        remoteDataSource.getAllMovies(object : RemoteDataSource.LoadMoviesCallback{
            override fun onAllMoviesReceived(moviesResponse: List<MoviesResponse>) {
                val movieList = ArrayList<MoviesEntity>()
                for(response in moviesResponse){
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
                movieResults.postValue(movieList)
            }

        })
        return movieResults
    }

    override fun getAllTvshow(): LiveData<List<TvshowEntity>> {
        val tvshowResult = MutableLiveData<List<TvshowEntity>>()

        remoteDataSource.getAllTvshow(object : RemoteDataSource.LoadTvshowCallback{
            override fun onAllTvshowReceived(tvshowResponse: List<TvshowResponse>) {
                val tvshowList = ArrayList<TvshowEntity>()
                for(response in tvshowResponse){
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
                tvshowResult.postValue(tvshowList)
            }
        })


        return tvshowResult
    }

    override fun getMoviesWithId(moviesId: String): LiveData<MoviesEntity> {
        val moviesResult = MutableLiveData<MoviesEntity>()

        remoteDataSource.getAllMovies(object : RemoteDataSource.LoadMoviesCallback{
            override fun onAllMoviesReceived(moviesResponse: List<MoviesResponse>) {
                lateinit var movies: MoviesEntity
                movies = MoviesEntity("","","","","","")
                for (response in moviesResponse) {
                    if (response.id == moviesId) {
                        movies = MoviesEntity(
                            response.id,
                            response.title,
                            response.description,
                            response.releaseDate,
                            response.rating,
                            response.imagePath
                        )
                    }
                }
                moviesResult.postValue(movies)
            }
        })
        return moviesResult
    }

    override fun getTvshowWithId(tvshowId: String): LiveData<TvshowEntity> {
        val tvshowResult = MutableLiveData<TvshowEntity>()

        remoteDataSource.getAllTvshow(object : RemoteDataSource.LoadTvshowCallback{
            override fun onAllTvshowReceived(tvshowResponse: List<TvshowResponse>) {
                lateinit var tvshow: TvshowEntity
                tvshow = TvshowEntity("","","","","","")
                for(response in tvshowResponse){
                    if(response.id == tvshowId){
                        tvshow = TvshowEntity(
                            response.id,
                            response.title,
                            response.description,
                            response.releaseDate,
                            response.rating,
                            response.imagePath
                        )
                    }
                }
                tvshowResult.postValue(tvshow)
            }
        })
        return tvshowResult
    }
}