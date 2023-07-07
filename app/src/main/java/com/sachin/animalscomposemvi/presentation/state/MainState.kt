package com.sachin.animalscomposemvi.presentation.state

import com.sachin.animalscomposemvi.domain.model.Animal

sealed class MainState {

    object Idle : MainState()
    object Loading : MainState()
    data class Success(val animals: List<Animal>) : MainState()
    data class Error(val errorMessage: String?) : MainState()

}