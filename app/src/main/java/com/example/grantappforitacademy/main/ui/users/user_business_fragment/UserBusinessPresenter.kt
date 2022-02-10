package com.example.grantappforitacademy.main.ui.users.user_business_fragment

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserBusinessPresenter(private val interactor: Interactor) :
    BasePresenter<UserBusinessContract.View>(),
    UserBusinessContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi() {
        presenterScope.launch {
            try {
                val data = interactor.getUsersBusiness()
                view?.getResultList(data)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
