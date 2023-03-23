package com.example.worklogger.helper

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner

/**
 * Created by Seunghwan Lee (KR19836) on 2023/03/21
 */

internal object ViewModelProviderHelper {
    fun <T : ViewModel> createViewModel(owner: ViewModelStoreOwner, viewModel: T) : T {
        return ViewModelProvider(owner, object : ViewModelProvider.Factory {
            override fun <V : ViewModel> create(modelClass: Class<V>): V {
                return viewModel as V
            }
        })[viewModel::class.java]
    }
}