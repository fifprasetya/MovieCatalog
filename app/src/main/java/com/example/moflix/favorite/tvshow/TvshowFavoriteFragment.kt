package com.example.moflix.favorite.tvshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moflix.R
import com.example.moflix.databinding.FragmentTvshowFavoriteBinding
import com.example.moflix.tvshow.TvshowAdapter
import com.example.moflix.viewmodel.ViewModelFactory


class TvshowFavoriteFragment : Fragment() {

    private lateinit var binding: FragmentTvshowFavoriteBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTvshowFavoriteBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(activity != null){
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[TvshowFavoriteViewModel::class.java]

            val adapter = TvshowAdapter()

            binding.progressBar.visibility = View.VISIBLE
            viewModel.getFavoriteTvshow().observe(viewLifecycleOwner, { tvshow ->
                binding.progressBar.visibility = View.GONE
                adapter.setTvshow(tvshow)
                adapter.notifyDataSetChanged()
            })

            with(binding.rvTvshow){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }

    }

}