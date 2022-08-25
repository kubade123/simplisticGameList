package com.example.aplikasipertama.ui.Favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasipertama.Game
import com.example.aplikasipertama.GamesData
import com.example.aplikasipertama.R
import com.example.aplikasipertama.ui.ListGame.ListGameAdapter
import com.example.aplikasipertama.ui.ListGame.list


class FavoriteFragment : Fragment() {
    private lateinit var rvFavorite: RecyclerView
    private var listFav: ArrayList<Game> = list

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        rvFavorite = view.findViewById(R.id.rv_games)
        rvFavorite.layoutManager = layoutManager
        rvFavorite.setHasFixedSize(true)
        val favoriteAdapter = FavoriteAdapter(listFav)
        rvFavorite.adapter = favoriteAdapter
    }
}