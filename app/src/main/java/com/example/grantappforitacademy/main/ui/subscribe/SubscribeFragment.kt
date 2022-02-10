package com.example.grantappforitacademy.main.ui.subscribe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_question_and_answers.AdapterForQuestionAndAnswers
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentQuestionAndAnswersBinding
import com.example.grantappforitacademy.databinding.FragmentSubscribeBinding
import com.example.grantappforitacademy.main.NewsFragment
import com.example.grantappforitacademy.main.ui.question_and_answers.question_and_answers_create_fragment.QuestionAndAnswersCreateFragment
import com.example.grantappforitacademy.main.ui.question_and_answers.queston_and_answer_fragment.QuestionAndAnswersContract
import com.example.grantappforitacademy.main.ui.question_and_answers.queston_and_answer_fragment.QuestionAndAnswersPresenter
import com.example.grantappforitacademy.responsemodel.Contacts
import com.example.grantappforitacademy.responsemodel.QuestionsAndAnswers
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentSubscribeBinding

class SubscribeFragment : BaseFragmentMvp<SubscribeContract.View,
        SubscribeContract.Presenter>(R.layout.fragment_subscribe),
    SubscribeContract.View {

    override val presenter: SubscribePresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentSubscribeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.subscribe.setOnClickListener {
            presenter.getDataFromApi(contacts = Contacts(email = binding.email.toString()))
            changeFragment(NewsFragment(), R.id.frame_layout)
        }
    }
}