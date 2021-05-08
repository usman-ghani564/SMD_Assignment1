package com.example.assignment1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.assignment1.models.Countries
import com.example.assignment1.models.FavoriteClass

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<FavoriteClass> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return FavoriteViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.favorite_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        //in case we have more than one view holder classes
        when(holder){
            is FavoriteViewHolder ->{
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class FavoriteViewHolder constructor(itemView: View): RecyclerView.ViewHolder(itemView){
        private val cityName: TextView = itemView.findViewById(R.id.city_name)
        private val imageUrl: ImageView = itemView.findViewById(R.id.flag)
        private val lag: TextView = itemView.findViewById(R.id.status)
        private val date: TextView = itemView.findViewById(R.id.date)
        private val amPm: TextView = itemView.findViewById(R.id.am_pm)
        private val time: TextView = itemView.findViewById(R.id.time)

        fun bind(fav: FavoriteClass){
            cityName.text = fav.cityName
            lag.text = fav.lag
            date.text = fav.date
            amPm.text = fav.amPm
            time.text = fav.time

            //first we set defaults for image so that if something wrong
            //occurs then our app should not crash
            val requestOption = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
            //TODO: place image
                Glide.with(itemView.context)
                    .applyDefaultRequestOptions(requestOption)
                    .load(fav.imageUrl)
                    .into(imageUrl)
        }
    }

    fun submitList(list: List<FavoriteClass>){
        items = list
        notifyDataSetChanged()
    }

}