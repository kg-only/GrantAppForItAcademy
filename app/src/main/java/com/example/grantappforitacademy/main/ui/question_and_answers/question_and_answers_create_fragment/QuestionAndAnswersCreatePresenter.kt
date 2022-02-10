package com.example.grantappforitacademy.main.ui.question_and_answers.question_and_answers_create_fragment

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.ProviderAdvert
import com.example.grantappforitacademy.responsemodel.QuestionsAndAnswers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuestionAndAnswersCreatePresenter(private val interactor: Interactor) :
    BasePresenter<QuestionAndAnswersCreateContract.View>(),
    QuestionAndAnswersCreateContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi(questionsAndAnswers: QuestionsAndAnswers) {
        presenterScope.launch {
            try {
                interactor.postQuestionAndAnswersCreate(questionsAndAnswers)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
