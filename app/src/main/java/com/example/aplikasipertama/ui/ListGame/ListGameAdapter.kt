package com.example.aplikasipertama.ui.ListGame

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.aplikasipertama.Game
import com.example.aplikasipertama.R

class ListGameAdapter(private val listGame: ArrayList<Game>): RecyclerView.Adapter<ListGameAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.item_name)
        var tvDesc: TextView = itemView.findViewById(R.id.item_desc)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_games, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val game = listGame[position]

        Glide.with(holder.itemView.context)
            .load(game.photo)
            .apply(RequestOptions().override(256,256))
            .into(holder.imgPhoto)

        holder.tvName.text = game.name
        holder.tvDesc.text = game.detail
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listGame[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listGame.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Game)
    }


}