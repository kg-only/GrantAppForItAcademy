package com.example.grantappforitacademy.main.ui.logout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_event.AdapterForEvent
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentEventBinding
import com.example.grantappforitacademy.databinding.FragmentLogoutBinding
import com.example.grantappforitacademy.main.ui.events.InfoEventFragment
import com.example.grantappforitacademy.main.ui.events.event.EventContract
import com.example.grantappforitacademy.main.ui.events.event.EventPresenter
import com.example.grantappforitacademy.responsemodel.Event
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentLogoutBinding
private lateinit var adapter: AdapterForEvent

class LogoutFragment : BaseFragmentMvp<LogoutContract.View,
        LogoutContract.Presenter>(R.layout.fragment_logout), LogoutContract.View {

    override val presenter: LogoutPresenter by inject()
    private val presenterScope = CoroutineScope(Dispatchers.IO)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentLogoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenterScope.launch {
            presenter.getDataFromApi()
        }
    }
}