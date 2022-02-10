package com.example.grantappforitacademy.main.ui.users.user_register.user_register_provider_fragment

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.UserProviderProfile
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserRegisterProviderPresenter(private val interactor: Interactor) :
    BasePresenter<UserRegisterProviderContract.View>(),
    UserRegisterProviderContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi(userProviderProfile: UserProviderProfile) {
        presenterScope.launch {
            try {
                interactor.postUsersRegisterProvider(userProviderProfile)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
