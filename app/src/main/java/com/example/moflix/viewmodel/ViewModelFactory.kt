package com.example.moflix.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.moflix.data.source.MovieRepository
import com.example.moflix.detail.DetailMovieViewModel
import com.example.moflix.di.Injection
import com.example.moflix.favorite.movie.MoviesFavoriteViewModel
import com.example.moflix.favorite.tvshow.TvshowFavoriteViewModel
import com.example.moflix.movies.MoviesViewModel
import com.example.moflix.tvshow.TvshowViewModel

class ViewModelFactory private constructor(private val mMovieRepository: MovieRepository) :
    ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideRepository(context)).apply {
                    instance = this
                }
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        when {
            modelClass.isAssignableFrom(MoviesViewModel::class.java) -> {
                return MoviesViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(TvshowViewModel::class.java) -> {
                return TvshowViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(DetailMovieViewModel::class.java) -> {
                return DetailMovieViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(MoviesFavoriteViewModel::class.java) -> {
                return MoviesFavoriteViewModel(mMovieRepository) as T
            }
            modelClass.isAssignableFrom(TvshowFavoriteViewModel::class.java)->{
                return TvshowFavoriteViewModel(mMovieRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel class" + modelClass.name)
        }
    }
}