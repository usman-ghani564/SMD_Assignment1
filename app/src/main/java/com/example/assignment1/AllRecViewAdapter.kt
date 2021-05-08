package com.example.assignment1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment1.models.FavoriteClass
import com.example.assignment1.models.FavoriteDataSource

class AllRecViewAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<FavoriteClass> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AllRecViewAdapter.AllViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.all_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //in case we have more than one view holder classes
        when(holder){
            is AllRecViewAdapter.AllViewHolder ->{
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class AllViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private var checkBox: CheckBox = itemView.findViewById(R.id.check_box)
        private var cityName: TextView = itemView.findViewById(R.id.all_city_name)
        private var time: TextView = itemView.findViewById(R.id.all_time)

        fun bind(allItem: FavoriteClass){
            cityName.text = allItem.cityName
            time.text = allItem.time


            checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
                if(isChecked){
                    FavoriteDataSource.addFavorite(allItem)
                }
                else if(!isChecked){
                    FavoriteDataSource.removeFavorite(allItem)
                }
            }

        }
    }

    fun submitList(list: List<FavoriteClass>){
        items = list
        notifyDataSetChanged()
    }
}