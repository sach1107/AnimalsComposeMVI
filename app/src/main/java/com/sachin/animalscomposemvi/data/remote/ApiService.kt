package com.sachin.animalscomposemvi.data.remote

import com.sachin.animalscomposemvi.domain.model.Animal
import retrofit2.http.GET

interface ApiService {

    @GET("1ed0f3d7-fc46-4dd9-a476-731d35c9fd65")
    suspend fun getAnimals(): List<Animal>
}