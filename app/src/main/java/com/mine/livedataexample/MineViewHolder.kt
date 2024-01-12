package com.mine.livedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MineViewHolder: ViewModel() {

    private var counterLiveData = MutableLiveData<Int>()

    init {
        counterLiveData.value = 0
    }

    val ccLiveData:LiveData<Int> get() = counterLiveData

    fun counterPlus(){
        counterLiveData.value = (counterLiveData.value?:0) + 1
    }

}