package com.example.moflix.tvshow

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moflix.R
import com.example.moflix.databinding.FragmentTvshowBinding
import com.example.moflix.utils.DataDummy
import com.example.moflix.viewmodel.ViewModelFactory


class TvshowFragment : Fragment() {

    private lateinit var binding: FragmentTvshowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTvshowBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(activity != null){
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this,factory)[TvshowViewModel::class.java]
            //val tvshows = viewModel.getTvshows()
            val tvshowAdapter = TvshowAdapter()
            binding.progressBar.visibility = View.VISIBLE
            viewModel.getTvshows().observe(viewLifecycleOwner, { tvshows ->
                binding.progressBar.visibility = View.GONE
                tvshowAdapter.setTvshow(tvshows)
                tvshowAdapter.notifyDataSetChanged()

            })
            //tvshowAdapter.setTvshow(tvshows)

            with(binding.rvTvshow){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter= tvshowAdapter
            }
        }
    }

}