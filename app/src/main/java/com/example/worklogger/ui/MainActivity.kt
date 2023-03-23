package com.example.worklogger.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.worklogger.R

/**
 * Created by Seunghwan Lee (KR19836) on 2023/03/21
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container_view, MainFragment.newInstance()).commitAllowingStateLoss()
    }
    변경된 내용으로 수정
}
