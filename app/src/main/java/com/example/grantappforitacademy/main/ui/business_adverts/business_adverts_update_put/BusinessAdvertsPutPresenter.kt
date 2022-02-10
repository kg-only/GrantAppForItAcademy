package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_update_put

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.BusinessAdvertPost
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BusinessAdvertsPutPresenter(private val interactor: Interactor) :
    BasePresenter<BusinessAdvertsPutContract.View>(),
    BusinessAdvertsPutContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi(id:Int,businessAdvertPost: BusinessAdvertPost) {
        presenterScope.launch {
            try {
                interactor.putBusinessAdvertsUpdate(id,businessAdvertPost)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
