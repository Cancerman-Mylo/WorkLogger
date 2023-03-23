package com.example.worklogger.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.worklogger.databinding.LayoutFragmentMainBinding
import com.example.worklogger.helper.ViewModelProviderHelper
import com.example.worklogger.room.Repository
import com.example.worklogger.room.WorkDatabase

/**
 * Created by Seunghwan Lee (KR19836) on 2023/03/21
 */
class MainFragment : Fragment() {

    private var _binding: LayoutFragmentMainBinding? = null
    private val binding: LayoutFragmentMainBinding get() = _binding!!

    private val database by lazy { WorkDatabase.getDatabase(context = requireContext()) }
    private val repository by lazy { Repository(workDao = database.workDao()) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return LayoutFragmentMainBinding.inflate(inflater, container, false)
            .also { _binding = it }
            .root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        MainViewController(binding = binding, fragment = this)
        ViewModelProviderHelper.createViewModel(owner = this, MainViewModel(repository = repository))
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}