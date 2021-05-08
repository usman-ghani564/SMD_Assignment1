package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment1.models.FavoriteDataSource
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AllCitiesActivity : AppCompatActivity(), androidx.appcompat.widget.SearchView.OnQueryTextListener,
    SearchView.OnQueryTextListener {

    private lateinit var allAdapter: AllRecViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_cities)

        initRecyclerView()
        addData()

        //setting up back button
        val actionBar = supportActionBar
        actionBar!!.title = "All Cities"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)

        val search = menu?.findItem(R.id.menu_search)
        val searchView = search?.actionView as? androidx.appcompat.widget.SearchView
        searchView?.isSubmitButtonEnabled = true
        searchView?.setOnQueryTextListener(this)

        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        val intent = Intent(this, FavoriteActivity::class.java)
        startActivity(intent)
        return true
    }

    private fun addData(){
        val data = FavoriteDataSource.getAllCities()
        allAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        val recyclerView: RecyclerView = findViewById(R.id.all_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        allAdapter = AllRecViewAdapter()
        recyclerView.adapter = allAdapter
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        if(query!=null){
            allAdapter.submitList(FavoriteDataSource.searchAllCities(query))
        }
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        if (newText!=null) {
            allAdapter.submitList(FavoriteDataSource.searchAllCities(newText))
        }
        return true
    }
}