package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_post

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_event.AdapterForEvent
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentBusinessAdvertsPostBinding
import com.example.grantappforitacademy.main.ui.business_adverts.business_adverts.BusinessAdvertsFragment
import com.example.grantappforitacademy.responsemodel.BusinessAdvertPost
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentBusinessAdvertsPostBinding
private lateinit var adapter: AdapterForEvent

class BusinessAdvertsPostFragment : BaseFragmentMvp<BusinessAdvertsPostContract.View,
        BusinessAdvertsPostContract.Presenter>(R.layout.fragment_business_adverts_post), BusinessAdvertsPostContract.View {

    override val presenter: BusinessAdvertsPostPresenter by inject()
    private val presenterScope = CoroutineScope(Dispatchers.IO)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBusinessAdvertsPostBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            addNewAdvert.setOnClickListener {
                presenter.getDataFromApi( businessAdvertPost = BusinessAdvertPost(
                    title = title.text.toString(),
                    description = description.text.toString(),
                    price = price.text.toString(),
                    currency = currency(),
                    completed = completed.text.toString(),
                    user = user.text.toString().toInt(),
                    needs = needs.text.toString(),
                    suggest = suggest.text.toString(),
                    tel = tel.text.toString(),
                    days = days.text.toString().toInt()
                ))
                changeFragment(BusinessAdvertsFragment(), R.id.frame_layout)
            }
        }
    }

    private fun currency(): String {
        var text = ""
        binding.usd.setOnClickListener {
            text = "USD"
        }
        binding.som.setOnClickListener {
            text = "Сом"
        }
        return text
    }
}