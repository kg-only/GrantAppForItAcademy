package com.example.grantappforitacademy.main.ui.logout

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.Login
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LogoutPresenter(private val interactor: Interactor) :
    BasePresenter<LogoutContract.View>(),
    LogoutContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override fun getDataFromApi() {
        presenterScope.launch {
            try {
                interactor.postLogout()
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
