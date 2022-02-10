package com.example.grantappforitacademy.main.ui.login.login_refresh_fragment

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginRefreshPresenter(private val interactor: Interactor) :
    BasePresenter<LoginRefreshContract.View>(),
    LoginRefreshContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi() {
        presenterScope.launch {
            try {
                val data = interactor.getLinks()
//                view?.getResultList(data)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
