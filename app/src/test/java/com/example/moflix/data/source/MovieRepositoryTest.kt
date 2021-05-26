package com.example.moflix.data.source

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.moflix.data.source.remote.RemoteDataSource
import com.example.moflix.data.source.remote.response.MoviesResponse
import com.example.moflix.data.source.remote.response.TvshowResponse
import com.example.moflix.utils.DataDummy
import com.example.moflix.utils.LiveDataTestUtil
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test
import org.mockito.Mockito.mock
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.doAnswer
import org.junit.Assert.*
import org.junit.Rule
import org.mockito.Mockito
import org.mockito.Mockito.`when`

class MovieRepositoryTest {

    @get: Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = Mockito.mock(RemoteDataSource::class.java)
    private val movieRepository = FakeMovieRepository(remote)

    private val moviesResponse = DataDummy.generateRemoteDummyMovies()
    private val moviesId = moviesResponse[0].id
    private val tvshowResponse = DataDummy.generateRemoteDummyTvshow()
    private val tvshowId = tvshowResponse[0].id

    @Test
    fun getAllMovies() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMoviesCallback)
                .onAllMoviesReceived(moviesResponse)
            null
        }.`when`(remote).getAllMovies(any())
        val moviesEntity = LiveDataTestUtil.getValue(movieRepository.getAllMovies())
        verify<RemoteDataSource>(remote).getAllMovies(any())
        assertNotNull(moviesEntity)
        assertEquals(moviesResponse.size.toLong(), moviesEntity.size.toLong())
    }

    @Test
    fun getAllTvshow() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvshowCallback)
                .onAllTvshowReceived(tvshowResponse)
            null
        }.`when`(remote).getAllTvshow(any())
        val tvshowEntity = LiveDataTestUtil.getValue(movieRepository.getAllTvshow())
        verify<RemoteDataSource>(remote).getAllTvshow(any())
        assertNotNull(tvshowEntity)
        assertEquals(tvshowResponse.size.toLong(), tvshowEntity.size.toLong())
    }

    @Test
    fun getMoviesWithId(){
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMoviesCallback)
                .onAllMoviesReceived(moviesResponse)
            null
        }.`when`(remote).getAllMovies(any())

        val moviesEntity = LiveDataTestUtil.getValue(movieRepository.getMoviesWithId(moviesId))

        verify(remote).getAllMovies(any())

        assertNotNull(moviesEntity)
        assertNotNull(moviesEntity.moviesId)
        assertEquals(moviesResponse[0].id, moviesEntity.moviesId)
    }

    @Test
    fun getTvshowWithId(){
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvshowCallback)
                .onAllTvshowReceived(tvshowResponse)
            null
        }.`when`(remote).getAllTvshow(any())

        val tvshowEntity = LiveDataTestUtil.getValue(movieRepository.getTvshowWithId(tvshowId))

        verify(remote).getAllTvshow(any())

        assertNotNull(tvshowEntity)
        assertNotNull(tvshowEntity.tvshowId)
        assertEquals(tvshowResponse[0].id, tvshowEntity.tvshowId)
    }
}