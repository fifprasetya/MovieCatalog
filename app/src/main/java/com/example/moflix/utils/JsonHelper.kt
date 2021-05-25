package com.example.moflix.utils

import android.content.Context
import android.util.Log
import com.example.moflix.data.source.remote.response.MoviesResponse
import com.example.moflix.data.source.remote.response.TvshowResponse
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import cz.msebera.android.httpclient.Header
import org.json.JSONObject
import java.lang.Exception

class JsonHelper(private val context: Context) {

    companion object{
        private const val API_KEY = "556ebc9a62859a4edf17b58fe127f0e4"
    }

    fun loadMovies(): List<MoviesResponse>{
        val listMovies = ArrayList<MoviesResponse>()
        val client = AsyncHttpClient()
        val url = "https://api.themoviedb.org/3/movie/popular?api_key=$API_KEY"
        val imageURL = "https://image.tmdb.org/t/p/w400"

        client.get(url, object : AsyncHttpResponseHandler(){
            override fun onSuccess(
                statusCode: Int,
                headers: Array<out Header>,
                responseBody: ByteArray
            ) {
                val result = String(responseBody)
                Log.d("loadMovies", result)
                try{
                    val responseObject = JSONObject(result)
                    val resultsMovie = responseObject.getJSONArray("results")

                    for(i in 0 until resultsMovie.length()){
                        val movie = resultsMovie.getJSONObject(i)

                        val id = movie.getString("id").toString()
                        val title = movie.getString("original_title")
                        val description = movie.getString("overview")
                        val releaseDate = movie.getString("release_date")
                        val rating = movie.getString("vote_average").toString()
                        val imagePath = imageURL+movie.getString("poster_path")

                        val moviesResponse= MoviesResponse(id,title,description,releaseDate,rating,imagePath)
                        listMovies.add(moviesResponse)
                    }
                }catch (e: Exception){
                    Log.d("Exception",e.message.toString())
                }
            }

            override fun onFailure(
                statusCode: Int,
                headers: Array<out Header>,
                responseBody: ByteArray,
                error: Throwable
            ) {
                val errorMessage =when(statusCode){
                    401 ->"$statusCode : Bad Request"
                    403 ->"$statusCode : Forbidden"
                    404 -> "$statusCode : Not Found"
                    else -> "$statusCode : ${error.message}"
                }
                Log.d("OnFailure", errorMessage)
            }
        })
        return listMovies
    }

    fun loadTvshow(): List<TvshowResponse>{
        val listTvshow = ArrayList<TvshowResponse>()
        val client = AsyncHttpClient()
        val url = "https://api.themoviedb.org/3/tv/popular?api_key=$API_KEY"
        val imageURL = "https://image.tmdb.org/t/p/w400"

        client.get(url, object : AsyncHttpResponseHandler(){
            override fun onSuccess(
                statusCode: Int,
                headers: Array<out Header>,
                responseBody: ByteArray
            ) {
                val result = String(responseBody)
                Log.d("loadTvshow",result)
                try{
                    val responseObject =JSONObject(result)
                    val resultTvshow =responseObject.getJSONArray("results")

                    for(i in 0 until resultTvshow.length()){
                        val tvshow = resultTvshow.getJSONObject(i)

                        val id = tvshow.getString("id").toString()
                        val title =tvshow.getString("original_name")
                        val description = tvshow.getString("overview")
                        val releaseDate = tvshow.getString("first_air_date")
                        val rating = tvshow.getString("vote_average").toString()
                        val imagePath = imageURL + tvshow.getString("poster_path")

                        val tvshowResponse = TvshowResponse(id,title, description, releaseDate, rating, imagePath)
                        listTvshow.add(tvshowResponse)
                    }
                }catch (e: Exception){
                    Log.d("Exception", e.message.toString())
                }
            }

            override fun onFailure(
                statusCode: Int,
                headers: Array<out Header>,
                responseBody: ByteArray,
                error: Throwable
            ) {
                val errorMessage = when(statusCode){
                    401 ->"$statusCode : Bad Request"
                    403 ->"$statusCode : Forbidden"
                    404 -> "$statusCode : Not Found"
                    else -> "$statusCode : ${error.message}"
                }
                Log.d("onFailure", errorMessage)
            }
        })
        return listTvshow
    }
}