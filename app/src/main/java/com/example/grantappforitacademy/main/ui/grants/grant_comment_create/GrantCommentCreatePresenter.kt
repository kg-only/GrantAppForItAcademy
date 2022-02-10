package com.example.grantappforitacademy.main.ui.grants.grant_comment_create

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.GrantComment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GrantCommentCreatePresenter(private val interactor: Interactor) :
    BasePresenter<GrantCommentCreateContract.View>(),
    GrantCommentCreateContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi(grantComment: GrantComment) {
        presenterScope.launch {
            try {
                interactor.postGrantComments(grantComment)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
