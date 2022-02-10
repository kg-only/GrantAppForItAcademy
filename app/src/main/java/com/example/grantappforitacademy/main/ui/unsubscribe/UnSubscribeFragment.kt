package com.example.grantappforitacademy.main.ui.unsubscribe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentUnSubscribeBinding
import com.example.grantappforitacademy.main.NewsFragment
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentUnSubscribeBinding

class UnSubscribeFragment : BaseFragmentMvp<UnSubscribeContract.View,
        UnSubscribeContract.Presenter>(R.layout.fragment_un_subscribe),
    UnSubscribeContract.View {

    override val presenter: UnSubscribePresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentUnSubscribeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.unSubscribe.setOnClickListener {
            presenter.getDataFromApi(binding.email.toString())
            changeFragment(NewsFragment(), R.id.frame_layout)
        }
    }///////////////////////////////
}
