package com.example.grantappforitacademy.adapter.adapter_provider_advert

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.BusinessAdvertsViewBinding
import com.example.grantappforitacademy.databinding.ProviderAdvertsViewBinding
import com.example.grantappforitacademy.responsemodel.BusinessAdvert
import com.example.grantappforitacademy.responsemodel.ProviderAdvert
import java.security.Provider


class AdapterForProviderAdverts(private val onClick: (ProviderAdvert) -> Unit) :
    RecyclerView.Adapter<AdapterForProviderAdverts.ViewHolder>() {

    private val data = mutableListOf<ProviderAdvert>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = ProviderAdvertsViewBinding.bind(item)

        fun bind(item: ProviderAdvert) {
            with(binding) {
                comments.setOnClickListener { (onClick.invoke(item)) }
                id.text = item.id.toString()
                description.text = item.description.toString()
                price.text = item.price.toString()
                currency.text = item.currency.toString()
                user.text = item.user.toString()
                tel.text = item.tel.toString()
                createdAt.text = item.createdAt.toString()
                days.text = item.days.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.provider_adverts_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<ProviderAdvert>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}