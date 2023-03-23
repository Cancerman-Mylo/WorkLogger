package com.example.worklogger.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Created by Seunghwan Lee (KR19836) on 2023/03/21
 */
@Database(entities = [], version = 1)
abstract class WorkDatabase : RoomDatabase() {
    abstract fun workDao(): WorkDao

    companion object {
        private const val DB_NAME = "work_db"
        private var INSTANCE: WorkDatabase? = null

        fun getDatabase(context: Context): WorkDatabase {
            return INSTANCE ?: synchronized(WorkDatabase::class) {
                INSTANCE ?: Room.databaseBuilder(
                    context,
                    WorkDatabase::class.java, DB_NAME
                ).build().also { INSTANCE = it }
            }
        }
    }
}