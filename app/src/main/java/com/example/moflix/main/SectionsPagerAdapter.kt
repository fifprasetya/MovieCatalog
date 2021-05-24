package com.example.moflix.main

import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.moflix.R
import com.example.moflix.movies.MoviesFragment
import com.example.moflix.tvshow.TvshowFragment

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity){




    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when(position){
            0 -> fragment = MoviesFragment()
            1 -> fragment = TvshowFragment()
        }
        return fragment as Fragment
    }

    override fun getItemCount(): Int {
        return 2
    }
}