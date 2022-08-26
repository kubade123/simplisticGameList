package com.example.aplikasipertama.ui.ListGame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.aplikasipertama.R

class ListDetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_detail)

        val name = intent.getStringExtra("name")
        val photo = intent.getIntExtra("photo",0)
        val desc = intent.getStringExtra("deskripsi")
        val genre = intent.getStringExtra("genre")
        val fav = intent.getBooleanExtra("favorit",false)
        val shareText = "Coba mainkan ${name}!"
        var tvDetailName: TextView = findViewById(R.id.detail_name)
        var tvDetailDesc: TextView = findViewById(R.id.detail_desc)
        var tvFavStatus: TextView = findViewById(R.id.favorite_status)
        var tvGenre: TextView = findViewById(R.id.detail_genre)
        var imgDetailPhoto: ImageView = findViewById(R.id.detail_image)
        var buttonShare: Button = findViewById(R.id.action_share)

        tvDetailName.text = name
        tvDetailDesc.text = desc
        tvGenre.text = genre

        if (fav){
            tvFavStatus.text = "Yes"
        }
        else {
            tvFavStatus.text = "No"
        }

        imgDetailPhoto.setImageResource(photo)

        buttonShare.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.type= "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, shareText)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Game Recommendation")
            startActivity(Intent.createChooser(intent,"Select share option"))
        }

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = name
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}