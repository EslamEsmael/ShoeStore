package com.eslam.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eslam.shoestore.domain.entity.Shoe

class ShoeViewModel : ViewModel() {


    private val _shoeList = MutableLiveData<MutableList<Shoe>>()
    val shoeList: LiveData<MutableList<Shoe>> = _shoeList

    init {
        _shoeList.value = mutableListOf()
    }

    fun saveShoe(shoe: Shoe) {
        _shoeList.value?.add(shoe)
    }

}