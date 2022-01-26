package com.example.grantappforitacademy.main.ui.grantsfragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.FragmentInfoEventBinding
import com.example.grantappforitacademy.databinding.FragmentInfoGrantBinding
import com.example.grantappforitacademy.responsemodel.Event
import com.example.grantappforitacademy.responsemodel.Grant
import com.squareup.picasso.Picasso


private lateinit var binding: FragmentInfoGrantBinding
private lateinit var dataResult: Grant

class InfoGrantFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentInfoGrantBinding.inflate(inflater, container, false)
        dataResult = requireArguments().getParcelable("data")!!
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            titleInfoTextView.text = dataResult.name
            Picasso.get().load(dataResult.image).resize(400, 400)
                .centerCrop().into(imageInfoView)
            descriptionTextView.text = dataResult.description
            deadline.text = "До: " + dataResult.deadline
            sum.text = "Сумма: " + dataResult.sum.toString()
            currency.text = "Валюта: " + dataResult.currency
            location.text = "Место: " + dataResult.location
        }
    }
}