package com.example.grantappforitacademy.adapter.adapter_newsletter_list

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.LinksViewBinding
import com.example.grantappforitacademy.databinding.NewsletterListViewBinding
import com.example.grantappforitacademy.responsemodel.Contacts
import com.example.grantappforitacademy.responsemodel.Links


class AdapterForNewsletterList :
    RecyclerView.Adapter<AdapterForNewsletterList.ViewHolder>() {
    private val data = mutableListOf<Contacts>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = NewsletterListViewBinding.bind(item)

        fun bind(item: Contacts) {
            with(binding) {
               email.text = item.email
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context).inflate(R.layout.newsletter_list_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<Contacts>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}