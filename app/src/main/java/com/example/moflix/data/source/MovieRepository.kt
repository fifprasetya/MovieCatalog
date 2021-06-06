package com.example.moflix.data.source

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.moflix.data.NetworkBoundResource
import com.example.moflix.data.source.local.LocalDataSource
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.data.source.remote.ApiResponse
import com.example.moflix.data.source.remote.RemoteDataSource
import com.example.moflix.data.source.remote.response.MoviesResponse
import com.example.moflix.data.source.remote.response.TvshowResponse
import com.example.moflix.utils.AppExecutors
import com.example.moflix.vo.Resource

class MovieRepository private constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
    ) : MovieDataSource {

    companion object {
        @Volatile
        private var instance: MovieRepository? = null

        fun getInstance(remoteData: RemoteDataSource, localDataSource: LocalDataSource, appExecutors: AppExecutors): MovieRepository =
            instance ?: synchronized(this) {
                instance ?: MovieRepository(remoteData,localDataSource, appExecutors).apply { instance = this }
            }
    }

    override fun getAllMovies(): LiveData<Resource<List<MoviesEntity>>> {
        return object : NetworkBoundResource<List<MoviesEntity>, List<MoviesResponse>>(appExecutors){
            public override fun loadFromDB(): LiveData<List<MoviesEntity>> =
                localDataSource.getAllMovies()

            override fun shouldFetch(data: List<MoviesEntity>?): Boolean =
                data == null || data.isEmpty()

            public override fun createCall(): LiveData<ApiResponse<List<MoviesResponse>>> =
                remoteDataSource.getAllMovies()

            public override fun saveCallResult(movieResponses: List<MoviesResponse>) {
                val movieList = ArrayList<MoviesEntity>()
                for(response in movieResponses){
                    val movie = MoviesEntity(
                        response.id,
                        response.title,
                        response.description,
                        response.releaseDate,
                        response.rating,
                        response.imagePath,
                        false
                    )
                    movieList.add(movie)
                }
                localDataSource.insertMovies(movieList)
            }
        }.asLiveData()
    }

    override fun getAllTvshow(): LiveData<Resource<List<TvshowEntity>>> {
        return object : NetworkBoundResource<List<TvshowEntity>, List<TvshowResponse>>(appExecutors) {
            public override fun loadFromDB(): LiveData<List<TvshowEntity>> =
                localDataSource.getAllTvshow()

            override fun shouldFetch(data: List<TvshowEntity>?): Boolean =
                data == null || data.isEmpty()

            public override fun createCall(): LiveData<ApiResponse<List<TvshowResponse>>> =
                remoteDataSource.getAllTvshow()

            public override fun saveCallResult(tvshowResponse: List<TvshowResponse>) {
                val tvshowList = ArrayList<TvshowEntity>()
                for (response in tvshowResponse) {
                    val tvshow = TvshowEntity(
                        response.id,
                        response.title,
                        response.description,
                        response.releaseDate,
                        response.rating,
                        response.imagePath,
                        false
                    )
                    tvshowList.add(tvshow)
                }
                localDataSource.insertTvshow(tvshowList)
            }
        }.asLiveData()
    }

    override fun getMoviesWithId(moviesId: String): LiveData<Resource<MoviesEntity>> {

        return object : NetworkBoundResource<MoviesEntity, List<MoviesResponse>>(appExecutors) {
            public override fun loadFromDB(): LiveData<MoviesEntity> =
                localDataSource.getMoviesWithId(moviesId)

            override fun shouldFetch(data: MoviesEntity?): Boolean =
                data?.moviesId == null || data.moviesId.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<MoviesResponse>>> =
                remoteDataSource.getAllMovies()

            override fun saveCallResult(data: List<MoviesResponse>) {
                val movieList = ArrayList<MoviesEntity>()
                for (response in data) {
                    val movie = MoviesEntity(
                        response.id,
                        response.title,
                        response.description,
                        response.releaseDate,
                        response.rating,
                        response.imagePath,
                        false
                    )
                    movieList.add(movie)
                }
                localDataSource.insertMovies(movieList)
            }
        }.asLiveData()

    }

    override fun getTvshowWithId(tvshowId: String): LiveData<Resource<TvshowEntity>> {
        return object: NetworkBoundResource<TvshowEntity, List<TvshowResponse>>(appExecutors){
            public override fun loadFromDB(): LiveData<TvshowEntity> =
                localDataSource.getTvshowWithId(tvshowId)

            override fun shouldFetch(data: TvshowEntity?): Boolean =
                data?.tvshowId == null || data.tvshowId.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<TvshowResponse>>> =
                remoteDataSource.getAllTvshow()

            override fun saveCallResult(data: List<TvshowResponse>) {
                val tvshowList = ArrayList<TvshowEntity>()
                for (response in data){
                    val tvshow = TvshowEntity(
                        response.id,
                        response.title,
                        response.description,
                        response.releaseDate,
                        response.rating,
                        response.imagePath,
                        false
                    )
                    tvshowList.add(tvshow)
                }
                localDataSource.insertTvshow(tvshowList)
            }
        }.asLiveData()
    }

    override fun getFavoriteMovies(): LiveData<List<MoviesEntity>> =
        localDataSource.getFavoriteMovies()

    override fun getFavoriteTvshow(): LiveData<List<TvshowEntity>> =
        localDataSource.getFavoriteTvshow()

    override fun setMovieFavorite(movie: MoviesEntity, state: Boolean) {
        appExecutors.diskIO().execute { localDataSource.setMoviesFavorite(movie,state) }
    }

    override fun setTvshowFavorite(tvshow: TvshowEntity, state: Boolean) {
        appExecutors.diskIO().execute { localDataSource.setTvshowFavorite(tvshow,state) }
    }
}