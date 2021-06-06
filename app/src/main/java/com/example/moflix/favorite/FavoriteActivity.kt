package com.example.moflix.favorite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.viewpager2.widget.ViewPager2
import com.example.moflix.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class FavoriteActivity : AppCompatActivity() {

    companion object{
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.movies,
            R.string.tvshow
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        val sectionsPagerAdapter = SectionFavoritePagerAdapter(this)
        val viewPager: ViewPager2 = findViewById(R.id.view_pager_fav)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout  = findViewById(R.id.tabs_fav)
        TabLayoutMediator(tabs,viewPager){ tab,position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()

        supportActionBar?.elevation = 0f
    }
}