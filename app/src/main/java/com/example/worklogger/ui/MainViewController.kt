package com.example.worklogger.ui

import androidx.fragment.app.viewModels
import androidx.lifecycle.LifecycleOwner
import com.example.worklogger.databinding.LayoutFragmentMainBinding
import com.example.worklogger.helper.observeNonNull

/**
 * Created by Seunghwan Lee (KR19836) on 2023/03/21
 */
class MainViewController(
    val binding: LayoutFragmentMainBinding,
    val fragment: MainFragment
) {
    private val workListAdapter: WorkListAdapter by lazy { WorkListAdapter() }
    private val viewModel: MainViewModel by fragment.viewModels()

    private val viewLifecycleOwner: LifecycleOwner
        get() = fragment.viewLifecycleOwner

    init {
        initViews()
        initObservers()
    }

    private fun initViews() {
        binding.rvWorkList.adapter = workListAdapter
    }

    private fun initObservers() {
        with(viewModel) {
            workList.observeNonNull(viewLifecycleOwner) { workListAdapter.submitList(it) }
        }
    }
}