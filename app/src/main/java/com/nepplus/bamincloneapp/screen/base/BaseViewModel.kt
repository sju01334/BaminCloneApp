package com.nepplus.bamincloneapp.screen.base

import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel(){

    //Koin 을 사용할거기 때문에 state 생성
    protected var stateBundle : Bundle? = null

    //coroutine 사용을 위해 생성
    open fun fetchData() : Job = viewModelScope.launch { }


    open fun storeState(stateBundle: Bundle) {
        this.stateBundle = stateBundle
    }


}