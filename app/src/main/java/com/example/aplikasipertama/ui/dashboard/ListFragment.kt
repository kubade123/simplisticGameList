package com.example.aplikasipertama.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasipertama.Game
import com.example.aplikasipertama.GamesData
import com.example.aplikasipertama.R



class ListFragment : Fragment() {
    private lateinit var rvGames: RecyclerView
    private var list: ArrayList<Game> = arrayListOf()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        list.addAll(GamesData.listData)
        return inflater.inflate(R.layout.fragment_list_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        rvGames = view.findViewById(R.id.rv_games)
        rvGames.layoutManager = layoutManager
        rvGames.setHasFixedSize(true)
        val listGameAdapter = ListGameAdapter(list)
        rvGames.adapter = listGameAdapter

        listGameAdapter.setOnItemClickCallback(object : ListGameAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Game) {
                showSelectedGame(data)
            }
        })
    }
    private fun showSelectedGame(game: Game) {
        val intent = Intent(context, ListDetailActivity::class.java)
        intent.putExtra("name", game.name)
        intent.putExtra("photo", game.photo)
        intent.putExtra("detail", game.detail)
        startActivity(intent)
    }

}
