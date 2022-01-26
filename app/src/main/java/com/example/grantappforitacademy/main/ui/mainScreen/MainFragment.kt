package com.example.grantappforitacademy.main.ui.mainScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.common.mvp.BaseFragment
import com.example.grantappforitacademy.databinding.FragmentMainBinding
import com.example.grantappforitacademy.main.ui.blogpostsfragment.BlogpostsFragment
import com.example.grantappforitacademy.main.ui.createeventcomment.EventCommentFragment
import com.example.grantappforitacademy.main.ui.eventsfragment.EventFragment
import com.example.grantappforitacademy.main.ui.grantsfragment.GrantsFragment

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
        binding.blogposts.setOnClickListener {
            changeFragment(BlogpostsFragment(), R.id.frame_layout)
        }
        binding.events.setOnClickListener {
            changeFragment(EventFragment(), R.id.frame_layout)
        }
        binding.grants.setOnClickListener {
            changeFragment(GrantsFragment(), R.id.frame_layout)
        }
        binding.eventsComment.setOnClickListener {
            changeFragment(EventCommentFragment(), R.id.frame_layout)
        }

    }
}