package com.sachin.animalscomposemvi.data.remote

import com.sachin.animalscomposemvi.domain.model.Animal
import retrofit2.http.GET

interface ApiService {

    @GET("animals.json")
    suspend fun getAnimals(): List<Animal>
}