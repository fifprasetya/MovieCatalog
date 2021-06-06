package com.example.moflix.detail

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.moflix.R
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity
import com.example.moflix.databinding.ActivityDetailMovieBinding
import com.example.moflix.viewmodel.ViewModelFactory
import com.example.moflix.vo.Status

class DetailMovieActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIES = "extra_movies"
    }

    private lateinit var binding: ActivityDetailMovieBinding

    private lateinit var viewModel: DetailMovieViewModel

    var filmId: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val factory = ViewModelFactory.getInstance(this)
        viewModel = ViewModelProvider(
            this,
            factory
        )[DetailMovieViewModel::class.java]
        val moviesId = intent.getStringExtra(EXTRA_MOVIES)
        if (moviesId != null) {
            viewModel.setSelectedId(moviesId)


            viewModel.tvshowData.observe(this, { tvshow ->
                if (tvshow != null) {
                    if (tvshow.data != null) {

                        when (tvshow.status) {
                            Status.LOADING -> {
                                binding.progressBar.visibility = View.VISIBLE
                            }
                            Status.SUCCESS -> {
                                binding.progressBar.visibility = View.GONE
                                val state = tvshow.data.favorite
                                setFavoriteState(state)
                                populateTvshow(tvshow.data)
                            }
                            Status.ERROR -> {
                                binding.progressBar.visibility = View.GONE
                                Toast.makeText(
                                    applicationContext,
                                    "Terjadi Kesalahan",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }
                    } else {
                        Log.d("Mulai", "Movies")
                        viewModel.moviesData.observe(this, { movies ->
                            if (movies.data != null) {

                                when (movies.status) {
                                    Status.LOADING -> {

                                        binding.progressBar.visibility = View.VISIBLE
                                    }
                                    Status.SUCCESS -> {
                                        binding.progressBar.visibility = View.GONE
                                        val state = movies.data.favorite
                                        setFavoriteState(state)
                                        filmId = movies.data.moviesId
                                        populateMovies(movies.data)

                                    }
                                    Status.ERROR -> {
                                        binding.progressBar.visibility = View.GONE
                                        Toast.makeText(
                                            applicationContext,
                                            "Terjadi Kesalahan",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }
                                }
                            }
                        })
                    }
                }
            })



            binding.favBtn.setOnClickListener {
                Log.d("filmId1", filmId)
                Log.d("filmId2",moviesId)
                if (filmId == moviesId) {
                    viewModel.setFavoriteMovie()
                }
                else{
                    viewModel.setFavoriteTvshow()
                }
            }
        }
    }

    private fun setFavoriteState(state: Boolean) {
        if (state) {
            binding.favBtn.setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.ic_baseline_favorite_24
                )
            )

        } else {
            binding.favBtn.setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.ic_baseline_favorite_border_24
                )
            )
        }
    }

    private fun populateMovies(moviesEntity: MoviesEntity) {
        binding.textTitle.text = moviesEntity.title
        binding.textRelease.text = moviesEntity.releaseDate
        binding.textRating.text = moviesEntity.rating
        binding.textDescription.text = moviesEntity.description

        Glide.with(this)
            .load(moviesEntity.imagePath)
            .transform(RoundedCorners(20))
            .into(binding.imgPoster)
    }

    private fun populateTvshow(tvshowEntity: TvshowEntity) {
        binding.textTitle.text = tvshowEntity.title
        binding.textRelease.text = tvshowEntity.releaseDate
        binding.textRating.text = tvshowEntity.rating
        binding.textDescription.text = tvshowEntity.description

        Glide.with(this)
            .load(tvshowEntity.imagePath)
            .transform(RoundedCorners(20))
            .into(binding.imgPoster)
    }
}