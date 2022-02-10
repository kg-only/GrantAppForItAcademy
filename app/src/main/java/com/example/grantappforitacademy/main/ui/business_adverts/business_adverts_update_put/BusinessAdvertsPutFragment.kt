package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_update_put

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_event.AdapterForEvent
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentBusinessAdvertsPutBinding
import com.example.grantappforitacademy.main.ui.business_adverts.business_adverts.BusinessAdvertsFragment
import com.example.grantappforitacademy.responsemodel.BusinessAdvertPost
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentBusinessAdvertsPutBinding
private lateinit var adapter: AdapterForEvent

class BusinessAdvertsPutFragment : BaseFragmentMvp<BusinessAdvertsPutContract.View,
        BusinessAdvertsPutContract.Presenter>(R.layout.fragment_business_adverts_put),
    BusinessAdvertsPutContract.View {

    override val presenter: BusinessAdvertsPutPresenter by inject()
    private val presenterScope = CoroutineScope(Dispatchers.IO)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBusinessAdvertsPutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            addNewAdvert.setOnClickListener {
                presenter.getDataFromApi(1, businessAdvertPost = BusinessAdvertPost(
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