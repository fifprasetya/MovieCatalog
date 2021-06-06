package com.example.moflix.favorite.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moflix.R
import com.example.moflix.databinding.FragmentMoviesFavoriteBinding
import com.example.moflix.movies.MoviesAdapter
import com.example.moflix.viewmodel.ViewModelFactory


class MoviesFavoriteFragment : Fragment() {

    private lateinit var binding: FragmentMoviesFavoriteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMoviesFavoriteBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(activity != null){
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[MoviesFavoriteViewModel::class.java]

            val adapter = MoviesAdapter()

            binding.progressBar.visibility = View.VISIBLE
            viewModel.getFavoriteMovies().observe(viewLifecycleOwner, { movies ->
                binding.progressBar.visibility = View.GONE
                adapter.setMovies(movies)
                adapter.notifyDataSetChanged()
            })

            with(binding.rvMovies){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }


}