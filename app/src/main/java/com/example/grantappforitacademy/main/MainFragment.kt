package com.example.grantappforitacademy.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.common.mvp.BaseFragment
import com.example.grantappforitacademy.databinding.FragmentMainBinding
import com.example.grantappforitacademy.main.ui.write_us.WriteUsFragment

private lateinit var binding: FragmentMainBinding

class MainFragment : BaseFragment(R.layout.fragment_main) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        changeFragment(NewsFragment(), R.id.frame_layout)
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.news_menu -> changeFragment(NewsFragment(), R.id.frame_layout)
                R.id.home_menu -> changeFragment(WriteUsFragment(), R.id.frame_layout)
                R.id.info_menu -> changeFragment(WriteUsFragment(), R.id.frame_layout)
            }
            true
        }
    }
}