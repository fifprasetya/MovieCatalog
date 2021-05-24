package com.example.moflix.data

data class MoviesEntity (
        var moviesId: String,
        var title: String,
        var description :String,
        var releaseDate: String,
        var rating: String,
        var imagePath: Int
        )