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

    private val gameDetails = arrayOf("FPS, Strategy, Online",
            "Strategy, Adventure, RPG",
            "Strategy, Adventure, RPG",
            "MOBA, Strategy",
            "RPG, Souls-Like, Open World",
            "Adventure, RPG, Online",
            "Simulation, Arcade",
            "Survival, Adventure, Sandbox",
            "RPG, Fantasy, Adventure",
            "Platformer, Puzzle, Adventure")

    private val gameDesc = arrayOf("Game First-Person Shooter yang memiliki tema pertempuran antara counter-terrorist melawan terrorist",
            "Instalasi ketiga dari seri Dragon Age yang menceritakan tentang seorang Inquisitor yang muncul di tengah-tengah kekacauan dunia untuk merestorasi kedamaian dunia",
            "Title original yang menjadi instalasi pertama pada seri dragon age",
            "Game Multiplayer Online Battle Arena yang bertema pertempuran antara kubu Dire dan kubu Radiant dalam mempertahankan Ancient yang masing-masing pihak",
            "Game gebrakan terbaru dari FromSoftware yang mengguncang dunia game dengan inovasi pada genre Open-World RPG yang berbeda dari yang lain",
            "Bertemakan anime, Genshin Impact merupakan game yang viral akan inovasinya pada game cross-platform yang dapat dimainkan dan saling terkoneksi antara Smartphone, Playstation, dan PC.",
            "Game klasik dimana pemain membudidayakan aquarium untuk point yang dibutuhkan untuk menyelsaikan stage. Hati-hati akan monster yang bersembunyi di bayangan ",
            "Bertahan hidup di dunia yang sudah terlelap oleh lautan. Tugasmu adalah bertahan hidup dan mencari siapa dalang di balik semua ini dan temukan rekan survivor yang lain",
            "Seorang tahanan yang akan di eksekusi mati, itu jika sebuah 'kejadian' tersebut tidak terjadi. Temukan jati dirimu dan berpetualang pada dunia skyrim",
            "Sebuah game puzzle adventure berlatar dunia post-apocalypse dimana tugasmu sebagai kucing untuk memecahkan misteri dibalik hilangnya manusia dan invasi robot yang memerintah dunia"

    )

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
                game.desc = gameDesc[i]
                list.add(game)
            }
            return list
        }
}

