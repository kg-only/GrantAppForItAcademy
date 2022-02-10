package com.example.grantappforitacademy.adapter.adater_grant

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.GrantViewBinding
import com.example.grantappforitacademy.responsemodel.Grant
import com.squareup.picasso.Picasso


class AdapterForGrant(private val onClick: (Grant) -> Unit) :
    RecyclerView.Adapter<AdapterForGrant.ViewHolder>() {
    private val data = mutableListOf<Grant>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = GrantViewBinding.bind(item)


        fun bind(item: Grant) {
            with(binding) {
                itemView.setOnClickListener { (onClick.invoke(item)) }
                titleTextView.text = item.name
                date.text = item.createdAt
                deadline.text = item.deadline
                sum.text = item.sum.toString()
                currency.text = item.currency
                Picasso.get().load(item.image).resize(400, 400)
                    .centerCrop().into(imageView)

            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context).inflate(R.layout.grant_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<Grant>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}