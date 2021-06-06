package com.example.moflix.tvshow

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moflix.R
import com.example.moflix.databinding.FragmentTvshowBinding
import com.example.moflix.utils.DataDummy
import com.example.moflix.viewmodel.ViewModelFactory
import com.example.moflix.vo.Status


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

            viewModel.getTvshows().observe(viewLifecycleOwner, { tvshows ->
                if(tvshows != null){
                    when (tvshows.status){
                        Status.LOADING -> binding.progressBar.visibility = View.VISIBLE
                        Status.SUCCESS -> {
                            binding.progressBar.visibility = View.GONE
                            tvshowAdapter.setTvshow(tvshows.data)
                            tvshowAdapter.notifyDataSetChanged()
                        }
                        Status.ERROR -> {
                            binding.progressBar.visibility = View.GONE
                            Toast.makeText(context, "Terjadi Kesalahan", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            })
            //tvshowAdapter.setTvshow(tvshows)

            with(binding.rvTvshow){
                this.layoutManager = LinearLayoutManager(context)
                this.setHasFixedSize(true)
                this.adapter= tvshowAdapter
            }
        }
    }

}