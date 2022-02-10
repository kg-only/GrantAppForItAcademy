package com.example.grantappforitacademy.adapter.adater_grant

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.GrantCommentViewBinding
import com.example.grantappforitacademy.responsemodel.GrantComment
import com.squareup.picasso.Picasso


class AdapterForGrantComment :
    RecyclerView.Adapter<AdapterForGrantComment.ViewHolder>() {
    private val data = mutableListOf<GrantComment>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = GrantCommentViewBinding.bind(item)


        fun bind(item: GrantComment) {
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
            LayoutInflater.from(parent.context).inflate(R.layout.event_comments_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<GrantComment>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}