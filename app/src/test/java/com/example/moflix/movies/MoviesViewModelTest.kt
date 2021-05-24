package com.example.moflix.movies

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MoviesViewModelTest {

    private lateinit var viewModel: MoviesViewModel

    @Before
    fun setUp(){
        viewModel = MoviesViewModel()
    }

    @Test
    fun getMovies() {
        val moviesEntities= viewModel.getMovies()
        assertNotNull(moviesEntities)
        assertEquals(10, moviesEntities.size)
    }
}