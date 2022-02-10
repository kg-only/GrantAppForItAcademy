package com.example.grantappforitacademy.adapter.adapter_business_adverts

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.BusinessAdvertsViewBinding
import com.example.grantappforitacademy.responsemodel.BusinessAdvert


class AdapterForBusinessAdverts(private val onClick: (BusinessAdvert) -> Unit) :
    RecyclerView.Adapter<AdapterForBusinessAdverts.ViewHolder>() {

    private val data = mutableListOf<BusinessAdvert>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = BusinessAdvertsViewBinding.bind(item)

        fun bind(item: BusinessAdvert) {
            with(binding) {
                comments.setOnClickListener { (onClick.invoke(item)) }
                id.text = item.id.toString()
                description.text = item.description.toString()
                price.text = item.price.toString()
                currency.text = item.currency.toString()
                completed.text = item.completed.toString()
                user.text = item.user.toString()
                needs.text = item.needs.toString()
                suggest.text = item.suggest.toString()
                tel.text = item.tel.toString()
                createdAt.text = item.created_at.toString()
                days.text = item.days.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.business_adverts_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<BusinessAdvert>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}