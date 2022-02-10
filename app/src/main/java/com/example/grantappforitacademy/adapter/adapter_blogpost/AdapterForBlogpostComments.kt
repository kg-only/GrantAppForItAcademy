package com.example.grantappforitacademy.adapter.adapter_blogpost

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.BlogpostCommentsViewBinding
import com.example.grantappforitacademy.responsemodel.BlogComment
import com.squareup.picasso.Picasso


class AdapterForBlogpostComments :
    RecyclerView.Adapter<AdapterForBlogpostComments.ViewHolder>() {
    private val data = mutableListOf<BlogComment>()


    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {

        private val binding = BlogpostCommentsViewBinding.bind(item)

        fun bind(item: BlogComment) {
            with(binding) {
//                idTextView.text = item.id.toString()
                postInfo.text = item.post.toString()
                postedInfo.text = item.posted.toString()
                val user = item.user!!
                userId.text = user.id.toString()
                Picasso.get().load(user.avatar).resize(400, 400)
                    .centerCrop().into(userImage)
                userFirstName.text = user.firstName.toString()
                userSecondName.text = user.lastName
                textInfo.text = item.text.toString()
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.blogpost_comments_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<BlogComment>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}