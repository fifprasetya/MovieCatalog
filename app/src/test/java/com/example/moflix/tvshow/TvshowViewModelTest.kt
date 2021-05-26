package com.example.moflix.tvshow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.moflix.data.source.MovieRepository
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.data.source.remote.response.TvshowResponse
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

@RunWith(MockitoJUnitRunner::class)
class TvshowViewModelTest {

    private lateinit var viewModel: TvshowViewModel

    @get: Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var observer: Observer<List<TvshowEntity>>

    @Before
    fun setUp(){
        viewModel = TvshowViewModel(movieRepository)
    }

    @Test
    fun getTvshows() {
        val dummyTvshow = DataDummy.generateDummyTvshow()
        val tvshows = MutableLiveData<List<TvshowEntity>>()
        tvshows.value = dummyTvshow
        `when`(movieRepository.getAllTvshow()).thenReturn(tvshows)
        val tvshowEntities = viewModel.getTvshows().value
        verify<MovieRepository>(movieRepository).getAllTvshow()
        assertNotNull(tvshowEntities)
        assertEquals(20, tvshowEntities?.size)

        viewModel.getTvshows().observeForever(observer)
        verify(observer).onChanged(dummyTvshow)
    }
}