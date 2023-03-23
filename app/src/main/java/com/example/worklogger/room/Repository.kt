package com.example.worklogger.room

import androidx.lifecycle.LiveData

/**
 * Created by Seunghwan Lee (KR19836) on 2023/03/21
 */
class Repository(workDao: WorkDao) {

    val workList: LiveData<List<String>> = workDao.getWorkList()

    suspend fun getWorkList(): List<String> {

    }
}