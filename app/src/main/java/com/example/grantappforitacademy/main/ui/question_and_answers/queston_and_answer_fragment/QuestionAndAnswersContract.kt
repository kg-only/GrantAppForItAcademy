package com.example.grantappforitacademy.main.ui.question_and_answers.queston_and_answer_fragment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.Grant
import com.example.grantappforitacademy.responsemodel.ProviderAdvert
import com.example.grantappforitacademy.responsemodel.QuestionsAndAnswers

interface QuestionAndAnswersContract {
    interface View : MvpView {
        fun getResultList(item: List<QuestionsAndAnswers>)
    }

    interface Presenter : MvpPresenter<View> {
        fun getDataFromApi()

    }
}