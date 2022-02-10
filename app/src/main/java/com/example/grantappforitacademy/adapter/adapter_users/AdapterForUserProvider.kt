package com.example.grantappforitacademy.adapter.adapter_users

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.UserProviderViewBinding
import com.example.grantappforitacademy.responsemodel.UserProviderProfile
import com.squareup.picasso.Picasso


class AdapterForUserProvider :
    RecyclerView.Adapter<AdapterForUserProvider.ViewHolder>() {

    private val data = mutableListOf<UserProviderProfile>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = UserProviderViewBinding.bind(item)

        fun bind(item: UserProviderProfile) {
            with(binding) {
                id.text = item.id.toString()
                email.text = item.email
                firstName.text = item.firstName
                lastName.text = item.lastName
                birthDate.text = item.birthDate
                gender.text = item.gender
                county.text = item.country
                city.text = item.city
                phone.text = item.phone
                telegram.text = item.telegram
                Picasso.get().load(item.avatar).resize(400, 400)
                    .centerCrop().into(avatarImage)
                site.text = item.site
                isPremium.text = item.isPremium.toString()
                startDate.text = item.startDate
                endDate.text = item.endDate
                isBusiness.text = item.isBusiness.toString()
                isProvider.text = item.isProvider.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.user_provider_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<UserProviderProfile>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}