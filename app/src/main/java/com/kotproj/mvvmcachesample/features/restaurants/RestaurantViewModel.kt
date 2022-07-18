package com.kotproj.mvvmcachesample.features.restaurants

import androidx.lifecycle.*
import com.kotproj.mvvmcachesample.api.RestaurantApi
import com.kotproj.mvvmcachesample.data.Restaurant
import com.kotproj.mvvmcachesample.data.RestaurantRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RestaurantViewModel @Inject constructor(
    repository: RestaurantRepository
) : ViewModel() {

    val restaurants = repository.getRestaurants().asLiveData()
}