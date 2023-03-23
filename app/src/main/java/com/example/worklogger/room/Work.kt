package com.example.worklogger.room

import androidx.room.Entity

/**
 * Created by Seunghwan Lee (KR19836) on 2023/03/23
 */


@Entity(
    tableName = Work.TABLE_NAME,
    primaryKeys = [RecentLive.COLUMN_NAME_VIEWER_ID, RecentLive.COLUMN_NAME_TYPE]
)
data class Work(
    val name: String,
    val
) {

    companion object {
        const val TABLE_NAME = "work"
        const val COLUMN_NAME_VIEWER_ID = "viewer_id"
        const val COLUMN_NAME_TYPE = "type"
        private const val COLUMN_NAME_SERVER_PHASE = "server_phase"
    }
}
