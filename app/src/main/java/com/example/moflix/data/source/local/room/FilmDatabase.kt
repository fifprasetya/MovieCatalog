package com.example.moflix.data.source.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.data.source.local.entity.TvshowEntity

@Database(entities = [MoviesEntity::class, TvshowEntity::class],version = 1, exportSchema = false)
abstract class FilmDatabase: RoomDatabase() {
    abstract fun filmDao(): FilmDao

    companion object{

        @Volatile
        private var INSTANCE: FilmDatabase? = null

        fun getInstance(context: Context): FilmDatabase =
            INSTANCE ?: synchronized(this){
                Room.databaseBuilder(
                    context.applicationContext,
                    FilmDatabase::class.java,
                    "FilmDatabase.db"
                ).build().apply {
                    INSTANCE = this
                }
            }
    }
}