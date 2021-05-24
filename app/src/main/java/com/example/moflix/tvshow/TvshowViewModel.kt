package com.example.moflix.tvshow

import androidx.lifecycle.ViewModel
import com.example.moflix.data.TvshowEntity
import com.example.moflix.utils.DataDummy

class TvshowViewModel: ViewModel() {

    fun getTvshows(): List<TvshowEntity> = DataDummy.generateDummyTvshow()
}