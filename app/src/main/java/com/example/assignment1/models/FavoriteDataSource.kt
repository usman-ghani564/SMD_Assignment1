package com.example.assignment1.models

class FavoriteDataSource {
    companion object{
        private var favoriteList: ArrayList<FavoriteClass> = ArrayList()
        private var AllList: ArrayList<FavoriteClass> = ArrayList()
        fun addFavorite(fav: FavoriteClass){
            if(!favoriteList.contains(fav)){
                favoriteList.add(fav)
            }
        }

        fun removeFavorite(fav: FavoriteClass){
            if(favoriteList.contains(fav)){
                favoriteList.remove(fav)
            }
        }

        fun getFavorites(): ArrayList<FavoriteClass>{
            return favoriteList
        }

        fun searchAllCities(sequence: String?): ArrayList<FavoriteClass>{
            val newList: ArrayList<FavoriteClass> = ArrayList()
            for(item in AllList){
                if(item.cityName.contains(sequence!!, true)){
                    newList.add(item)
                }
            }
            return newList
        }

        fun getAllCities(): ArrayList<FavoriteClass>{
            if(AllList.isEmpty()) {
                AllList.add(
                    FavoriteClass(
                        "Berlin",
                        "10:05",
                        "18",
                        "AM",
                        "Today, 5 hour ahead",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/germany.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Munich",
                        "10:05",
                        "18",
                        "AM",
                        "Today, 5 hour ahead",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/germany.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Hamburg",
                        "10:05",
                        "18",
                        "AM",
                        "Today, 5 hour ahead",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/germany.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Frankfurt",
                        "10:05",
                        "18",
                        "AM",
                        "Today, 5 hour ahead",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/germany.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Lahore",
                        "05:17",
                        "18",
                        "PM",
                        "Today, current",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/pakistan%20flag.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Karachi",
                        "05:57",
                        "18",
                        "PM",
                        "Today, 30 minutes ahead",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/pakistan%20flag.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Islamabad",
                        "05:17",
                        "18",
                        "PM",
                        "Today, current",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/pakistan%20flag.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Multan",
                        "05:17",
                        "18",
                        "PM",
                        "Today, current",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/pakistan%20flag.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Peshawar",
                        "05:17",
                        "18",
                        "PM",
                        "Today, current",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/pakistan%20flag.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "London",
                        "12:17",
                        "18",
                        "PM",
                        "Today, 7 hours ahead",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/england%20flag.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Manchester",
                        "12:17",
                        "18",
                        "PM",
                        "Today, 7 hours ahead",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/england%20flag.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "LiverPool",
                        "12:17",
                        "18",
                        "PM",
                        "Today, 7 hours ahead",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/england%20flag.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Bristol",
                        "12:17",
                        "18",
                        "PM",
                        "Today, 7 hours ahead",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/england%20flag.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Riyadh",
                        "06:17",
                        "18",
                        "PM",
                        "Today, 1 hours ahead",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/saudia.jpg"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Jeddah",
                        "06:17",
                        "18",
                        "PM",
                        "Today, 1 hours ahead",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/saudia.jpg"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Madina",
                        "06:17",
                        "18",
                        "PM",
                        "Today, 1 hours ahead",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/saudia.jpg"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Makkah",
                        "06:17",
                        "18",
                        "PM",
                        "Today, 1 hours ahead",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/saudia.jpg"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Paris",
                        "01:17",
                        "18",
                        "PM",
                        "Today, 4 hours behind",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/france.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Lyon",
                        "01:17",
                        "18",
                        "PM",
                        "Today, 4 hours behind",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/france.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Nice",
                        "01:17",
                        "18",
                        "PM",
                        "Today, 4 hours behind",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/france.png"
                    )
                )
                AllList.add(
                    FavoriteClass(
                        "Marseille",
                        "01:17",
                        "18",
                        "PM",
                        "Today, 4 hours behind",
                        "https://raw.githubusercontent.com/usman-ghani564/SMD-assignment1-resources/main/france.png"
                    )
                )
            }
            return AllList
        }
    }
}