package com.example.football.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.football.data.repository.MatchesRepository
import com.example.football.ui.favourites.FavouritesViewModel
import com.example.football.ui.home.HomeViewModel

class ViewModelFactory(
    private val matchesRepository: MatchesRepository
) : ViewModelProvider.NewInstanceFactory(){

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModel(matchesRepository) as T
    }


}