package com.example.grantappforitacademy.adapter.adapter_question_and_answers

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.QuestionAndAnswersViewBinding
import com.example.grantappforitacademy.responsemodel.QuestionsAndAnswers


class AdapterForQuestionAndAnswers :
    RecyclerView.Adapter<AdapterForQuestionAndAnswers.ViewHolder>() {

    private val data = mutableListOf<QuestionsAndAnswers>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = QuestionAndAnswersViewBinding.bind(item)

        fun bind(item: QuestionsAndAnswers) {
            with(binding) {
                id.text = item.id.toString()
                question.text = item.question.toString()
                answer.text = item.answer.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.question_and_answers_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<QuestionsAndAnswers>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}