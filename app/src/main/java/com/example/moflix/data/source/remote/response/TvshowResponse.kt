package com.example.moflix.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TvshowResponse (
    var id: String,
    var title: String,
    var description: String,
    var releaseDate: String,
    var rating: String,
    var imagePath: String
        ):Parcelable