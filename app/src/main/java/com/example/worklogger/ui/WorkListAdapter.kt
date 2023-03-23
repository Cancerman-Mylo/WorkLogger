package com.example.worklogger.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.worklogger.databinding.LayoutWorkViewHolderBinding

/**
 * Created by Seunghwan Lee (KR19836) on 2023/03/21
 */
class WorkListAdapter() : ListAdapter<WorkListItem, WorkListViewHolder>(DEFAULT_DIFF_UTIL) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LayoutWorkViewHolderBinding.inflate(inflater, parent, false)

        return WorkListViewHolder(binding = binding)
    }

    override fun onBindViewHolder(holder: WorkListViewHolder, position: Int) {
        holder.onBind()
    }

    companion object {
        val DEFAULT_DIFF_UTIL = object : DiffUtil.ItemCallback<WorkListItem>() {
            override fun areItemsTheSame(oldItem: WorkListItem, newItem: WorkListItem): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: WorkListItem, newItem: WorkListItem): Boolean {
                return areItemsTheSame(oldItem, newItem)
            }
        }
    }
}

class WorkListItem() {

}

class WorkListViewHolder(binding: LayoutWorkViewHolderBinding) : ViewHolder(binding.root) {
    fun onBind() {

    }
}