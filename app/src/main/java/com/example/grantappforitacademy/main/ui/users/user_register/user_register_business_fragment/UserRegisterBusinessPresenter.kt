package com.example.grantappforitacademy.main.ui.users.user_register.user_register_business_fragment

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.UserBusinessProfile
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserRegisterBusinessPresenter(private val interactor: Interactor) :
    BasePresenter<UserRegisterBusinessContract.View>(),
    UserRegisterBusinessContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi(userBusinessProfile: UserBusinessProfile) {
        presenterScope.launch {
            try {
                interactor.postUsersRegisterBusiness(userBusinessProfile)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
