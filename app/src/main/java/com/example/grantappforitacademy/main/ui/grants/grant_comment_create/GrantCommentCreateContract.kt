package com.example.grantappforitacademy.main.ui.grants.grant_comment_create

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.Grant
import com.example.grantappforitacademy.responsemodel.GrantComment

interface GrantCommentCreateContract {
    interface View : MvpView {

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi(grantComment: GrantComment)

    }
}