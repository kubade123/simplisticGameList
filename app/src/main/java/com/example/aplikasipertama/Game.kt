package com.example.aplikasipertama

import com.example.aplikasipertama.ui.ListGame.list

data class Game (
    var name: String = "",
    var detail: String = "",
    var desc: String = "",
    var photo: Int = 0,
    var favorite : Boolean = false
) {
    fun addFavorite(favList : Game) {
        favorite = true
        if (!list.contains(favList)) {
            list.add(favList)
        }
    }
    fun removeFavorite(favList : Game) {
        favorite = false
    }
}
