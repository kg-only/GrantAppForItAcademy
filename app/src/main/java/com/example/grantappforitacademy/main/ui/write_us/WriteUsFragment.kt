package com.example.grantappforitacademy.main.ui.write_us

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentWriteUsBinding
import com.example.grantappforitacademy.responsemodel.WriteUs
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentWriteUsBinding

class WriteUsFragment : BaseFragmentMvp<WriteUsContract.View,
        WriteUsContract.Presenter>(R.layout.fragment_grants), WriteUsContract.View {

    override val presenter: WriteUsPresenter by inject()
    private val presenterScope = CoroutineScope(Dispatchers.IO)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentWriteUsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.addComment.setOnClickListener {
                presenter.getDataFromApi(writeUs = WriteUs(
                    fullName = binding.fullName.text.toString(),
                    phone = binding.phone.text.toString(),
                    email = binding.email.text.toString(),
                    message = binding.message.text.toString()
                ))
        }
    }
}
