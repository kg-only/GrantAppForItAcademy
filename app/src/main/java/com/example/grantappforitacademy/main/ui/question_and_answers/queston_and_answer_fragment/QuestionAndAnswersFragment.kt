package com.example.grantappforitacademy.main.ui.question_and_answers.queston_and_answer_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.adapter_question_and_answers.AdapterForQuestionAndAnswers
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentQuestionAndAnswersBinding
import com.example.grantappforitacademy.main.ui.question_and_answers.question_and_answers_create_fragment.QuestionAndAnswersCreateFragment
import com.example.grantappforitacademy.responsemodel.QuestionsAndAnswers
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentQuestionAndAnswersBinding
private lateinit var adapter: AdapterForQuestionAndAnswers

class QuestionAndAnswersFragment : BaseFragmentMvp<QuestionAndAnswersContract.View,
        QuestionAndAnswersContract.Presenter>(R.layout.fragment_question_and_answers),
    QuestionAndAnswersContract.View {

    override val presenter: QuestionAndAnswersPresenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentQuestionAndAnswersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.getDataFromApi()
        recyclerView()
        binding.addQuestion.setOnClickListener {
            changeFragment(QuestionAndAnswersCreateFragment(), R.id.frame_layout)
        }
    }///////////////////////////////

    private fun recyclerView() {
        adapter = AdapterForQuestionAndAnswers()
        binding.recycler.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recycler.adapter = adapter
    }


    override fun getResultList(item: List<QuestionsAndAnswers>) {
        adapter.setItems(item)
    }
}