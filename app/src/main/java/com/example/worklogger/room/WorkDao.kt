package com.example.worklogger.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

/**
 * Created by Seunghwan Lee (KR19836) on 2023/03/21
 */
@Dao
interface WorkDao {


    @Query("SELECT * FROM work_list")
    fun getWorkList(): LiveData<List<String>>
}