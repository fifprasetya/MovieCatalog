package com.example.moflix.favorite

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.moflix.favorite.movie.MoviesFavoriteFragment
import com.example.moflix.favorite.tvshow.TvshowFavoriteFragment

class SectionFavoritePagerAdapter(activity:AppCompatActivity): FragmentStateAdapter(activity) {


    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position){
            0 -> fragment = MoviesFavoriteFragment()
            1 -> fragment = TvshowFavoriteFragment()
        }
        return fragment as Fragment
    }

    override fun getItemCount(): Int {
        return 2
    }
}