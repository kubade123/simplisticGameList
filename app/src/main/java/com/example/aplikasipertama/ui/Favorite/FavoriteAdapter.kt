package com.example.aplikasipertama.ui.Favorite

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.aplikasipertama.Game
import com.example.aplikasipertama.R
import com.example.aplikasipertama.ui.ListGame.list

class FavoriteAdapter(private val listGame: ArrayList<Game>): RecyclerView.Adapter<FavoriteAdapter.ListViewHolder>()  {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.item_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item)
        var btnDelete: Button = itemView.findViewById(R.id.btn_delete_favorite)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.fragment_favorite, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val game = listGame[position]

        Glide.with(holder.itemView.context)
            .load(game.photo)
            .apply(RequestOptions().override(256,256))
            .into(holder.imgPhoto)
        holder.tvName.text = game.name
        holder.btnDelete.setOnClickListener{listGame[holder.adapterPosition].removeFavorite(listGame[holder.adapterPosition]);
            Toast.makeText(holder.itemView.context, "Unfavorite " + listGame[holder.adapterPosition].name, Toast.LENGTH_SHORT).show();
            list.removeAt(holder.adapterPosition);
            notifyItemRemoved(holder.adapterPosition);
            notifyItemRangeChanged(position,itemCount)}
    }
    override fun getItemCount(): Int {
        return listGame.size
    }
}