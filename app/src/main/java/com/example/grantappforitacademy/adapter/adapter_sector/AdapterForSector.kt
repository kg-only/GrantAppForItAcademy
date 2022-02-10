package com.example.grantappforitacademy.adapter.adapter_sector

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.QuestionAndAnswersViewBinding
import com.example.grantappforitacademy.databinding.SectorViewBinding
import com.example.grantappforitacademy.responsemodel.QuestionsAndAnswers
import com.example.grantappforitacademy.responsemodel.Sector


class AdapterForSector :
    RecyclerView.Adapter<AdapterForSector.ViewHolder>() {

    private val data = mutableListOf<Sector>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = SectorViewBinding.bind(item)

        fun bind(item: Sector) {
            with(binding) {
                name.text = item.name.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.sector_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<Sector>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}