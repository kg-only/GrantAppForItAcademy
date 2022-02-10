package com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_comment_create

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.Grant
import com.example.grantappforitacademy.responsemodel.ProviderAdvertComment

interface ProviderAdvertsCommentCreateContract {
    interface View : MvpView

    interface Presenter : MvpPresenter<View> {
        suspend fun getDataFromApi(providerAdvertComment: ProviderAdvertComment)

    }
}