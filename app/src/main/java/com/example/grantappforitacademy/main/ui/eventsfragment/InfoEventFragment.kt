package com.example.grantappforitacademy.main.ui.eventsfragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.common.mvp.BaseFragment
import com.example.grantappforitacademy.databinding.FragmentInfoEventBinding
import com.example.grantappforitacademy.responsemodel.Event
import com.squareup.picasso.Picasso

private lateinit var binding: FragmentInfoEventBinding
private lateinit var dataResult: Event

class InfoEventFragment : BaseFragment(R.layout.fragment_main) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentInfoEventBinding.inflate(inflater, container, false)
        dataResult = requireArguments().getParcelable("data")!!
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            titleInfoTextView.text = dataResult.name
            Picasso.get().load(dataResult.eventImage).resize(400, 400)
                .centerCrop().into(imageInfoView)
            descriptionTextView.text = dataResult.description
            dateTextView.text = "Дата: " + dataResult.date
            timeTextView.text = "Время: " +dataResult.time
            locationTextView.text = "Место: " + dataResult.location
            formatTextView.text = "Формат: " + dataResult.eventFormat
            sumTextView.text = "Сумма: " + dataResult.sum.toString()
        }


    }
}