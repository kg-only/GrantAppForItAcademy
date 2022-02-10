package com.example.grantappforitacademy.main.ui.users.user_provider_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_users.AdapterForUserProvider
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentUserProviderBinding
import com.example.grantappforitacademy.responsemodel.UserProviderProfile
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentUserProviderBinding
private lateinit var adapter: AdapterForUserProvider

class UserProviderFragment : BaseFragmentMvp<UserProviderContract.View,
        UserProviderContract.Presenter>(R.layout.fragment_sector),
    UserProviderContract.View {

    override val presenter: UserProviderPresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentUserProviderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.getDataFromApi()
        recyclerView()

    }///////////////////////////////

    private fun recyclerView() {
        adapter = AdapterForUserProvider()
        binding.recycler.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recycler.adapter = adapter
    }

    override fun getResultList(item: List<UserProviderProfile>) {
        adapter.setItems(item)
    }
}
