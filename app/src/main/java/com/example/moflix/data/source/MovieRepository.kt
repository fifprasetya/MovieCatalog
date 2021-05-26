package com.example.moflix.data.source

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.data.source.remote.RemoteDataSource
import com.example.moflix.data.source.remote.response.MoviesResponse
import com.example.moflix.data.source.remote.response.TvshowResponse

class MovieRepository private constructor(private val remoteDataSource: RemoteDataSource): MovieDataSource {

    companion object{
        @Volatile
        private var instance: MovieRepository? = null

        fun getInstance(remoteData: RemoteDataSource): MovieRepository =
            instance ?: synchronized(this){
                instance ?: MovieRepository(remoteData).apply { instance = this }
            }
    }

    override fun getAllMovies(): LiveData<List<MoviesEntity>> {
        Log.d("RepositorysmovieList", "Check Data")
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
                    Log.d("RepositorysmovieList", response.title)
                }
                movieResults.postValue(movieList)
            }

        })
        Log.d("RepositoryMovieList", "Check Selesai")
        return movieResults
    }

    override fun getAllTvshow(): LiveData<List<TvshowEntity>> {
        Log.d("RepositorystvList", "Check Data")
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
                    Log.d("RepositorystvshowList", response.title)
                }
                tvshowResult.postValue(tvshowList)
            }
        })


        Log.d("RepositorytvList", "Check Selesai")
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