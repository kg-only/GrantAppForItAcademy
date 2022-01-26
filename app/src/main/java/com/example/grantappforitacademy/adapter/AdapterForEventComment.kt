package com.example.grantappforitacademy.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.EventCommentViewBinding
import com.example.grantappforitacademy.databinding.EventViewBinding
import com.example.grantappforitacademy.databinding.GrantViewBinding
import com.example.grantappforitacademy.responsemodel.Event
import com.example.grantappforitacademy.responsemodel.EventComment
import com.example.grantappforitacademy.responsemodel.Grant
import com.squareup.picasso.Picasso


class AdapterForEventComment :
    RecyclerView.Adapter<AdapterForEventComment.ViewHolder>() {
    private val data = mutableListOf<EventComment>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = EventCommentViewBinding.bind(item)


        fun bind(item: EventComment) {
            with(binding) {
                idTextView.text = item.id.toString()
                postInfo.text = item.post.toString()
                user.text = item.user.toString()
                    .split(",").toString()
                textInfo.text = item.text.toString()
                postedInfo.text = item.posted.toString()

            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context).inflate(R.layout.event_comment_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<EventComment>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}