package com.example.grantappforitacademy.main.ui.question_and_answers.question_and_answers_create_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentQuestionAndAnswersCreateBinding
import com.example.grantappforitacademy.main.ui.question_and_answers.queston_and_answer_fragment.QuestionAndAnswersFragment
import com.example.grantappforitacademy.responsemodel.QuestionsAndAnswers
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentQuestionAndAnswersCreateBinding

class QuestionAndAnswersCreateFragment : BaseFragmentMvp<QuestionAndAnswersCreateContract.View,
        QuestionAndAnswersCreateContract.Presenter>(R.layout.fragment_question_and_answers_create),
    QuestionAndAnswersCreateContract.View {

    override val presenter: QuestionAndAnswersCreatePresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentQuestionAndAnswersCreateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addBtn.setOnClickListener {
            with(binding) {
                presenter.getDataFromApi(questionsAndAnswers = QuestionsAndAnswers(
                    question = question.text.toString(),
                    answer = answer.text.toString()))
            }
            changeFragment(QuestionAndAnswersFragment(), R.id.frame_layout)
        }
    }
}