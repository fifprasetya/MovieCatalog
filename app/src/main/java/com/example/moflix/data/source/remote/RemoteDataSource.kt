package com.example.moflix.data.source.remote

import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.moflix.data.source.remote.response.MoviesResponse
import com.example.moflix.data.source.remote.response.TvshowResponse
import com.example.moflix.utils.EspressoIdlingResources
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

    fun getAllMovies(): LiveData<ApiResponse<List<MoviesResponse>>> {
        EspressoIdlingResources.increment()
        val resultMovie = MutableLiveData<ApiResponse<List<MoviesResponse>>>()
        handler.postDelayed(
            {
                resultMovie.value = ApiResponse.success(jsonHelper.loadMovies())
                EspressoIdlingResources.decrement()
            },
            SERVICE_LATENCY_IN_MILLIS
        )
        return resultMovie
    }

    fun getAllTvshow(): LiveData<ApiResponse<List<TvshowResponse>>> {
        EspressoIdlingResources.increment()
        val resultTvshow = MutableLiveData<ApiResponse<List<TvshowResponse>>>()
        handler.postDelayed(
            {
                resultTvshow.value = ApiResponse.success(jsonHelper.loadTvshow())
                EspressoIdlingResources.decrement()
            },
            SERVICE_LATENCY_IN_MILLIS
        )
        return resultTvshow
    }

}