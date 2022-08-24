package com.example.aplikasipertama.ui.ListGame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.example.aplikasipertama.R

class ListDetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_detail)

        val name = intent.getStringExtra("name")
        val photo = intent.getIntExtra("photo",0)
        val desc = intent.getStringExtra("detail")
        var tvDetailName: TextView = findViewById(R.id.detail_name)
        var tvDetailDesc: TextView = findViewById(R.id.detail_desc)
        var imgDetailPhoto: ImageView = findViewById(R.id.detail_image)
        tvDetailName.text = name
        tvDetailDesc.text = desc
        imgDetailPhoto.setImageResource(photo)

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
}