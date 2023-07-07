package com.sachin.animalscomposemvi.domain.repository

import com.sachin.animalscomposemvi.domain.model.Animal

interface AnimalRepository {

    suspend fun getAnimals(): List<Animal>
}