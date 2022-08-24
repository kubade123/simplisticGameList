package com.example.aplikasipertama

object GamesData {
    private val gameNames = arrayOf("Counter Strike: Global Offensive" ,
            "Dragon Age: Inquisition",
            "Dragon Age: Origin",
            "Dota 2",
            "Elden Ring",
            "Genshin Impact",
            "Insaniquarium",
            "Raft",
            "Elder Scroll Skyrim",
            "Stray")

    private val gameDetails = arrayOf("game FPS",
            "Game RPG",
            "Game RPG",
            "Game MOBA",
            "Game Souls Like",
            "Game Adventure",
            "Game simulasi",
            "Game Survival",
            "Game Rpg Fantasi",
            "Game platform kucing")

    private val gameImages = intArrayOf(R.drawable.csgo,
            R.drawable.da_inquisition,
            R.drawable.da_origin,
            R.drawable.dota_2,
            R.drawable.elden_ring,
            R.drawable.genshin_impact,
            R.drawable.insani,
            R.drawable.raft,
            R.drawable.skyrim,
            R.drawable.stray)

    val listData: ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (i in gameNames.indices) {
                val game = Game()
                game.name = gameNames[i]
                game.detail = gameDetails[i]
                game.photo = gameImages[i]
                list.add(game)
            }
            return list
        }

        }

