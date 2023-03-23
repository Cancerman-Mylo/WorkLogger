package com.example.worklogger.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.worklogger.room.Repository

/**
 * Created by Seunghwan Lee (KR19836) on 2023/03/21
 */
class MainViewModel(
    val repository: Repository
)
    :ViewModel() {
    private val _workList = MutableLiveData<List<String>>()
    val workList: LiveData<List<String>> = _workList

    init {
        initWorkList()
    }

    private fun initWorkList() {
        _workList.value = repository.getWorkList()
    }
}