package com.example.grantappforitacademy.adapter.adapter_provider_advert

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.ProviderAdvertsCommentsViewBinding
import com.example.grantappforitacademy.responsemodel.ProviderAdvertComment
import com.squareup.picasso.Picasso


class AdapterForProviderAdvertComments :
    RecyclerView.Adapter<AdapterForProviderAdvertComments.ViewHolder>() {
    private val data = mutableListOf<ProviderAdvertComment>()


    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {

        private val binding = ProviderAdvertsCommentsViewBinding.bind(item)

        fun bind(item: ProviderAdvertComment) {
            with(binding) {
//                idTextView.text = item.id.toString()
                val comment = item
                postInfo.text = comment.post.toString()
                textInfo.text = comment.text.toString()
                //user
                val user = comment.user!!
                userId.text = user.id.toString()
                Picasso.get().load(user.avatar).resize(400, 400)
                    .centerCrop().into(userImage)
                userFirstName.text = user.firstName.toString()
                userSecondName.text = user.lastName
                //
                postedInfo.text = postedInfo.text.toString()

            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.provider_adverts_comments_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<ProviderAdvertComment>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}