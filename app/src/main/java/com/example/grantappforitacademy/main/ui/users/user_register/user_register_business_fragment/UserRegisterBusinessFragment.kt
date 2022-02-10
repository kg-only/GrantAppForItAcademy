package com.example.grantappforitacademy.main.ui.users.user_register.user_register_business_fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentUserRegisterBusinessBinding
import com.example.grantappforitacademy.main.NewsFragment
import com.example.grantappforitacademy.responsemodel.UserBusinessProfile
import com.squareup.picasso.Picasso
import org.koin.android.ext.android.inject
import java.lang.Exception

private lateinit var binding: FragmentUserRegisterBusinessBinding

class UserRegisterBusinessFragment : BaseFragmentMvp<UserRegisterBusinessContract.View,
        UserRegisterBusinessContract.Presenter>(R.layout.fragment_user_register_business),
    UserRegisterBusinessContract.View {

    override val presenter: UserRegisterBusinessPresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentUserRegisterBusinessBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.register.setOnClickListener {
            with(binding) {
                try {
                    presenter.getDataFromApi(userBusinessProfile = UserBusinessProfile(
                        email = email.text.toString(),
                        firstName = firstName.text.toString(),
                        lastName = lastName.text.toString(),
                        birthDate = null,
                        password = password.text.toString(),
                        password2 = password2.text.toString(),
                        gender = gender.text.toString(),
                        country = country.text.toString(),
                        city = city.text.toString(),
                        phone = phone.text.toString(),
                        telegram = telegram.text.toString(),
                        avatar = null,
                        site = site.text.toString(),
                        startDate = null,
                        endDate = null
                    ))
                }catch (e:Exception){
                    Log.e("###",e.toString())
                }

            }

            changeFragment(NewsFragment(), R.id.frame_layout)
        }
    }///////////////////////////////
}
