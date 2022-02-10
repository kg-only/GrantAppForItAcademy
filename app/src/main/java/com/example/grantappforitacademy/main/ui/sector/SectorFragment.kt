package com.example.grantappforitacademy.main.ui.sector

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_sector.AdapterForSector
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentSectorBinding
import com.example.grantappforitacademy.responsemodel.Sector
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentSectorBinding
private lateinit var adapter: AdapterForSector

class SectorFragment : BaseFragmentMvp<SectorContract.View,
        SectorContract.Presenter>(R.layout.fragment_sector),
    SectorContract.View {

    override val presenter: SectorPresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentSectorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.getDataFromApi()
        recyclerView()

    }///////////////////////////////

    private fun recyclerView() {
        adapter = AdapterForSector()
        binding.recycler.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recycler.adapter = adapter
    }


    override fun getResultList(item: List<Sector>) {
        adapter.setItems(item)
    }
}
