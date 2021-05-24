package com.example.moflix.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moflix.R
import com.example.moflix.data.TvshowEntity
import com.example.moflix.databinding.ItemsMoviesBinding
import com.example.moflix.detail.DetailMovieActivity

class TvshowAdapter: RecyclerView.Adapter<TvshowAdapter.TvshowViewHolder>() {

    private var listTvshow = ArrayList<TvshowEntity>()

    fun setTvshow(tvshow: List<TvshowEntity>?){
        if(tvshow == null)return
        this.listTvshow.clear()
        this.listTvshow.addAll(tvshow)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TvshowAdapter.TvshowViewHolder {
        val itemsTvshowBinding = ItemsMoviesBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return TvshowViewHolder(itemsTvshowBinding)
    }

    override fun onBindViewHolder(holder: TvshowAdapter.TvshowViewHolder, position: Int) {
        val tvshow = listTvshow[position]
        holder.bind(tvshow)
    }

    override fun getItemCount(): Int = listTvshow.size

    class TvshowViewHolder(private val binding: ItemsMoviesBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(tvshow: TvshowEntity){
            with(binding){
                tvItemTitle.text = tvshow.title
                tvItemDate.text = tvshow.releaseDate
                tvItemRate.text = tvshow.rating
                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_MOVIES, tvshow.tvshowId)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(tvshow.imagePath)
                    .into(imgPoster)
            }
        }
    }
}