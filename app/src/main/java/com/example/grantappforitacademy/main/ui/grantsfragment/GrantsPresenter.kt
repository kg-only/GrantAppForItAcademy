package com.example.grantappforitacademy.main.ui.grantsfragment

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.InteractorTestClass
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GrantsPresenter(private val interactor: InteractorTestClass) :
    BasePresenter<GrantsContract.View>(),
    GrantsContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override suspend fun getDataFromApi(method: String) {
        presenterScope.launch {
            try {
                val data = interactor.getGrantRequest(method)
                view?.getResultList(data)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
