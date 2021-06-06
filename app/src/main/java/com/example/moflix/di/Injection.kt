package com.example.moflix.di

import android.content.Context
import com.example.moflix.data.source.MovieRepository
import com.example.moflix.data.source.local.LocalDataSource
import com.example.moflix.data.source.local.room.FilmDatabase
import com.example.moflix.data.source.remote.RemoteDataSource
import com.example.moflix.utils.AppExecutors
import com.example.moflix.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): MovieRepository{

        val database = FilmDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.filmDao())
        val appExecutors = AppExecutors()

        return MovieRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}