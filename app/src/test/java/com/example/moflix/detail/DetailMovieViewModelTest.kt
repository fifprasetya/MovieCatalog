package com.example.moflix.detail

import com.example.moflix.tvshow.TvshowViewModel
import com.example.moflix.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovies= DataDummy.generateDummyMovies()[0]
    private val dummyTvshow = DataDummy.generateDummyTvshow()[0]
    private val moviesId = dummyMovies.moviesId
    private val tvshowId = dummyTvshow.tvshowId

    @Before
    fun setUp(){
        viewModel = DetailMovieViewModel()
    }

    @Test
    fun getTvshow(){
        viewModel.setSelectedId(tvshowId)
        val tvshowEntity = viewModel.getTvshow()
        assertNotNull(tvshowEntity)
        assertEquals(dummyTvshow.tvshowId, tvshowEntity.tvshowId)
        assertEquals(dummyTvshow.title, tvshowEntity.title)
        assertEquals(dummyTvshow.description,tvshowEntity.description)
        assertEquals(dummyTvshow.rating, tvshowEntity.rating)
        assertEquals(dummyTvshow.releaseDate, tvshowEntity.releaseDate)
        assertEquals(dummyTvshow.imagePath, tvshowEntity.imagePath)
    }

    @Test
    fun getMovies(){
        viewModel.setSelectedId(moviesId)
        val moviesEntity = viewModel.getMovies()
        assertNotNull(moviesEntity)
        assertEquals(dummyMovies.moviesId, moviesEntity.moviesId)
        assertEquals(dummyMovies.title,moviesEntity.title)
        assertEquals(dummyMovies.description,moviesEntity.description)
        assertEquals(dummyMovies.rating,moviesEntity.rating)
        assertEquals(dummyMovies.releaseDate,moviesEntity.releaseDate)
        assertEquals(dummyMovies.imagePath,moviesEntity.imagePath)
    }
}