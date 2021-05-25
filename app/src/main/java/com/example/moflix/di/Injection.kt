package com.example.moflix.di

import android.content.Context
import com.example.moflix.data.source.MovieRepository
import com.example.moflix.data.source.remote.RemoteDataSource
import com.example.moflix.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): MovieRepository{
        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        return MovieRepository.getInstance(remoteDataSource)
    }
}