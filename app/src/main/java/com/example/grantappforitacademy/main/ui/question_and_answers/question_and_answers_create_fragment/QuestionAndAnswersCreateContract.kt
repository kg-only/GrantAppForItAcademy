package com.example.grantappforitacademy.main.ui.question_and_answers.question_and_answers_create_fragment

import com.example.grantappforitacademy.common.mvp.MvpPresenter
import com.example.grantappforitacademy.common.mvp.MvpView
import com.example.grantappforitacademy.responsemodel.ProviderAdvert
import com.example.grantappforitacademy.responsemodel.QuestionsAndAnswers

interface QuestionAndAnswersCreateContract {
    interface View : MvpView {

    }

    interface Presenter : MvpPresenter<View> {
         fun getDataFromApi(questionsAndAnswers: QuestionsAndAnswers)

    }
}