package com.example.moflix.data.source.remote

import android.os.Looper
import com.example.moflix.data.source.remote.response.MoviesResponse
import com.example.moflix.data.source.remote.response.TvshowResponse
import com.example.moflix.utils.JsonHelper
import java.util.logging.Handler

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {

    private val handler = android.os.Handler(Looper.getMainLooper())

    companion object {
        private const val SERVICE_LATENCY_IN_MILLIS: Long = 2000

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper).apply { instance = this }
            }
    }

    fun getAllMovies(callback: LoadMoviesCallback) {
        handler.postDelayed(
            { callback.onAllMoviesReceived(jsonHelper.loadMovies()) },
            SERVICE_LATENCY_IN_MILLIS
        )
    }

    fun getAllTvshow(callback: LoadTvshowCallback){
        handler.postDelayed({callback.onAllTvshowReceived(jsonHelper.loadTvshow())},
            SERVICE_LATENCY_IN_MILLIS)
    }

    interface LoadMoviesCallback{
        fun onAllMoviesReceived(moviesResponse: List<MoviesResponse>)
    }

    interface LoadTvshowCallback{
        fun onAllTvshowReceived(tvshowResponse: List<TvshowResponse>)
    }
}