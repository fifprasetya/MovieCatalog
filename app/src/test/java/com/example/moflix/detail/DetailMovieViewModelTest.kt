package com.example.moflix.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.moflix.data.source.MovieRepository
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.tvshow.TvshowViewModel
import com.example.moflix.utils.DataDummy
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner
import java.util.*

@RunWith(MockitoJUnitRunner::class)
class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovies= DataDummy.generateDummyMovies()[0]
    private val dummyTvshow = DataDummy.generateDummyTvshow()[0]
    private val moviesId = dummyMovies.moviesId
    private val tvshowId = dummyTvshow.tvshowId

    @get: Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var movieObserver: Observer<MoviesEntity>

    @Mock
    private lateinit var tvshowObserver: Observer<TvshowEntity>

    @Before
    fun setUp(){
        viewModel = DetailMovieViewModel(movieRepository)
    }

    @Test
    fun getTvshow(){
        viewModel.setSelectedId(tvshowId)
        val tvshow = MutableLiveData<TvshowEntity>()
        tvshow.value = dummyTvshow

        `when`(movieRepository.getTvshowWithId(tvshowId)).thenReturn(tvshow)
        val tvshowEntity = viewModel.getTvshow().value as TvshowEntity
        assertNotNull(tvshowEntity)
        assertEquals(dummyTvshow.tvshowId, tvshowEntity.tvshowId)

        viewModel.getTvshow().observeForever(tvshowObserver)
        verify(tvshowObserver).onChanged(dummyTvshow)
        //assertEquals(dummyTvshow.tvshowId, tvshowEntity.tvshowId)

    }

    @Test
    fun getMovies(){
        viewModel.setSelectedId(moviesId)
        val movies = MutableLiveData<MoviesEntity>()
        movies.value = dummyMovies

        `when`(movieRepository.getMoviesWithId(moviesId)).thenReturn(movies)
        val moviesEntity = viewModel.getMovies().value as MoviesEntity
        assertNotNull(moviesEntity)
        assertEquals(dummyMovies.moviesId, moviesEntity.moviesId)

        viewModel.getMovies().observeForever(movieObserver)
        verify(movieObserver).onChanged(dummyMovies)
        //assertEquals(dummyMovies.moviesId, moviesEntity.moviesId)

    }
}