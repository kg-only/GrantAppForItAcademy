package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_post

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.BusinessAdvertPost
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BusinessAdvertsPostPresenter(private val interactor: Interactor) :
    BasePresenter<BusinessAdvertsPostContract.View>(),
    BusinessAdvertsPostContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi(businessAdvertPost: BusinessAdvertPost) {
        presenterScope.launch {
            try {
                interactor.postBusinessAdverts(businessAdvertPost)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
