package com.example.moflix.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "moviesentities")
data class MoviesEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "moviesId")
    var moviesId: String,
    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "description")
    var description: String,
    @ColumnInfo(name = "releaseDate")
    var releaseDate: String,
    @ColumnInfo(name = "rating")
    var rating: String,
    @ColumnInfo(name = "imagePath")
    var imagePath: String,
    @ColumnInfo(name = "favorite")
    var favorite: Boolean = false
)