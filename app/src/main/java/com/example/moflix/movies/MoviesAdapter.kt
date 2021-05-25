package com.example.moflix.movies

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moflix.data.source.local.entity.MoviesEntity
import com.example.moflix.databinding.ItemsMoviesBinding
import com.example.moflix.detail.DetailMovieActivity

class MoviesAdapter: RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    private var listMovies = ArrayList<MoviesEntity>()


    fun setMovies(movies: List<MoviesEntity>?){
        if(movies == null)return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MoviesAdapter.MoviesViewHolder {
        val itemsMoviesBinding = ItemsMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesViewHolder(itemsMoviesBinding)
    }

    override fun onBindViewHolder(holder: MoviesAdapter.MoviesViewHolder, position: Int) {
       val movies = listMovies[position]
        holder.bind(movies)
    }

    override fun getItemCount(): Int = listMovies.size

    class MoviesViewHolder(private val binding: ItemsMoviesBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(movies: MoviesEntity){
            with(binding){
                tvItemTitle.text = movies.title
                tvItemDate.text = movies.releaseDate
                tvItemRate.text = movies.rating
                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_MOVIES, movies.moviesId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(movies.imagePath)
                    .into(imgPoster)
            }
        }
    }


}