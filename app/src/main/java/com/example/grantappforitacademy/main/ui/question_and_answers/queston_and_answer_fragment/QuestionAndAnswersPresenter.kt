package com.example.grantappforitacademy.main.ui.question_and_answers.queston_and_answer_fragment

import android.util.Log
import com.example.grantappforitacademy.common.mvp.BasePresenter
import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.responsemodel.ProviderAdvert
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuestionAndAnswersPresenter(private val interactor: Interactor) :
    BasePresenter<QuestionAndAnswersContract.View>(),
    QuestionAndAnswersContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override  fun getDataFromApi() {
        presenterScope.launch {
            try {
                val data = interactor.getQuestionAndAnswers()
                view?.getResultList(data)
                Log.e("####", "SUCCESSS")

            } catch (e: Exception) {
                Log.e("###", e.message.toString())
            }
        }
    }
}
