package com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_comment_post

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.BusinessAdvertCommentPost
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BusinessAdvertsCreateCommentPresenter(private val interactor: Interactor) :
    BasePresenter<BusinessAdvertsCreateCommentContract.View>(),
    BusinessAdvertsCreateCommentContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi(businessAdvertCommentPost: BusinessAdvertCommentPost) {
        presenterScope.launch {
            try {
               interactor.postBusinessAdvertsCreateComment(businessAdvertCommentPost)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
