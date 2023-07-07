package com.sachin.animalscomposemvi.data.repository

import com.sachin.animalscomposemvi.data.remote.ApiService
import com.sachin.animalscomposemvi.domain.model.Animal
import com.sachin.animalscomposemvi.domain.repository.AnimalRepository
import javax.inject.Inject

class AnimalRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : AnimalRepository {

    override suspend fun getAnimals(): List<Animal> = apiService.getAnimals()
}