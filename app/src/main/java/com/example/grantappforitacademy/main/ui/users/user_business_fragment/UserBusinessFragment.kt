package com.example.grantappforitacademy.main.ui.users.user_business_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_users.AdapterForUserBusiness
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentUserBusinessBinding
import com.example.grantappforitacademy.responsemodel.UserBusinessProfile
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentUserBusinessBinding
private lateinit var adapter: AdapterForUserBusiness

class UserBusinessFragment : BaseFragmentMvp<UserBusinessContract.View,
        UserBusinessContract.Presenter>(R.layout.fragment_user_business),
    UserBusinessContract.View {

    override val presenter: UserBusinessPresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentUserBusinessBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.getDataFromApi()
        recyclerView()
    }

    private fun recyclerView() {
        adapter = AdapterForUserBusiness()
        binding.recycler.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recycler.adapter = adapter
    }

    override fun getResultList(item: List<UserBusinessProfile>) {
        adapter.setItems(item)
    }
}
