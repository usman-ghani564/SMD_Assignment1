package com.example.assignment1.models

class Country(countryName: String, imageUrl: String) {
}

class Countries{
    companion object{
        fun getCountries(): ArrayList<Country>{
            val list: ArrayList<Country> = ArrayList()
            list.add(Country("America", "https://github.com/usman-ghani564/SMD-assignment1-resources/blob/main/america%20flag.png"))
            list.add(Country("Pakistan", "https://github.com/usman-ghani564/SMD-assignment1-resources/blob/main/pakistan%20flag.png"))
            list.add(Country("India", "https://github.com/usman-ghani564/SMD-assignment1-resources/blob/main/india%20flag.png"))
            list.add(Country("Saudia Arabia", "https://github.com/usman-ghani564/SMD-assignment1-resources/blob/main/saudia.jpg"))
            list.add(Country("France", "https://github.com/usman-ghani564/SMD-assignment1-resources/blob/main/france.png"))
            list.add(Country("Germany", "https://github.com/usman-ghani564/SMD-assignment1-resources/blob/main/germany.png"))
            list.add(Country("England", "https://github.com/usman-ghani564/SMD-assignment1-resources/blob/main/england%20flag.png"))
            return list
        }
    }
}