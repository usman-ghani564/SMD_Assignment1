package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment1.models.FavoriteDataSource
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FavoriteActivity : AppCompatActivity() {

    private lateinit var favoriteAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        initRecyclerView()
        addData()

        val actionBar = supportActionBar
        actionBar!!.title = "Favorites"
    }

    private fun addData(){
        val data = FavoriteDataSource.getFavorites()
        favoriteAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        val recyclerView: RecyclerView = findViewById(R.id.favorite_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        favoriteAdapter = RecyclerViewAdapter()
        recyclerView.adapter = favoriteAdapter

        //Also initiallizing floating action button here
        val fb: FloatingActionButton = findViewById(R.id.add_favorite)

        fb.setOnClickListener{
            val intent = Intent(this, AllCitiesActivity::class.java)
            startActivity(intent)
        }
    }

}