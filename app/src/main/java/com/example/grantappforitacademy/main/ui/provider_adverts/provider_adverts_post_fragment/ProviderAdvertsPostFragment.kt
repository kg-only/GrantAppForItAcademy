package com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_post_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentProviderAdvertsPostBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentProviderAdvertsPostBinding

class ProviderAdvertsPostFragment : BaseFragmentMvp<ProviderAdvertsPostContract.View,
        ProviderAdvertsPostContract.Presenter>(R.layout.fragment_provider_adverts_post),
    ProviderAdvertsPostContract.View {

    override val presenter: ProviderAdvertsPostPresenter by inject()
    private val presenterScope = CoroutineScope(Dispatchers.IO)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentProviderAdvertsPostBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            addNewAdvert.setOnClickListener {
                presenterScope.launch {
                    presenter.getDataFromApi(providerAdvert = ProviderAdvert(
                        title = title.text.toString(),
                        description = description.text.toString(),
                        price = price.text.toString(),
                        currency = currency.text.toString(),
                        tel = tel.text.toString(),
                        location = location.text.toString(),
                        createdAt = createdAt.text.toString(),
                        user = user.text.toString().toInt(),
                        days = days.text.toString().toInt()
                    ))
                    changeFragment(ProviderAdvertsFragment(), R.id.frame_layout)
                }
            }
        }
    }
}
