package com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_comment_create

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.ProviderAdvertComment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProviderAdvertsCommentCreatePresenter(private val interactor: Interactor) :
    BasePresenter<ProviderAdvertsCommentCreateContract.View>(),
    ProviderAdvertsCommentCreateContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override suspend fun getDataFromApi(providerAdvertComment: ProviderAdvertComment) {
        presenterScope.launch {
            try {
                interactor.postProviderAdvertsCommentCreate(providerAdvertComment)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
