package com.example.grantappforitacademy.main.ui.eventsfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.AdapterForEvent
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentEventBinding
import com.example.grantappforitacademy.responsemodel.Event
import com.example.grantappforitacademy.utils.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentEventBinding
private lateinit var adapter: AdapterForEvent

class EventFragment : BaseFragmentMvp<EventContract.View,
        EventContract.Presenter>(R.layout.fragment_event), EventContract.View {

    override val presenter: EventPresenter by inject()
    private val presenterScope = CoroutineScope(Dispatchers.IO)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentEventBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenterScope.launch {
            presenter.getDataFromApi(Constants.EVENTS)
        }
        recyclerView()
    }

    private fun recyclerView() {
        adapter = AdapterForEvent(onClick = { startInfoFragment(it) })
        binding.recyclerEvents.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerEvents.adapter = adapter
    }

    override fun getResultList(item: List<Event>) {
        adapter.setItems(item)
    }

    private fun startInfoFragment(event: Event) {
        val data = Bundle()
        data.putParcelable("data", event)
        val info = InfoEventFragment()
        info.arguments = data
        changeFragment(info, R.id.frame_layout)
    }
}