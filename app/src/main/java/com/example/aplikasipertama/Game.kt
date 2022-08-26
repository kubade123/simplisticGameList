package com.example.aplikasipertama

data class Game (
    var name: String = "",
    var detail: String = "",
    var desc: String = "",
    var photo: Int = 0,
    var favorite : Boolean = false
) {
    fun addFavorite(favList : Game) {
        favorite = true
        if (!com.example.aplikasipertama.ui.ListGame.favList.contains(favList)) {
            com.example.aplikasipertama.ui.ListGame.favList.add(favList)
        }
    }
    fun removeFavorite(favList : Game) {
        favorite = false
    }
}
