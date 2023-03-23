package com.example.worklogger.helper

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData

/**
 * Created by Seunghwan Lee (KR19836) on 2023/03/21
 */

fun <T> LiveData<out T?>.observeNonNull(owner: LifecycleOwner, body: (T) -> Unit) {
    observe(owner) { t -> t?.let { body(it) } }
}