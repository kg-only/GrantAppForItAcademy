package com.example.grantappforitacademy.adapter.adapter_blogpost

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.BlogpostViewBinding
import com.example.grantappforitacademy.responsemodel.BlogPost
import com.squareup.picasso.Picasso


class AdapterForBlogpost(private val onClick: (BlogPost) -> Unit) :
    RecyclerView.Adapter<AdapterForBlogpost.ViewHolder>() {
    private val data = mutableListOf<BlogPost>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {

        private val binding = BlogpostViewBinding.bind(item)

        fun bind(item: BlogPost) {
            itemView.setOnClickListener { (onClick.invoke(item)) }
            with(binding) {
                titleTextView.text = item.title
                subTitleTextView.text = item.subtitle
                descriptonTitleTextView.text = item.description
                createdTextView.text = item.created
//                adapter.setItems(listOf(item.comments.user!!))
                Picasso.get().load(item.postImage).resize(400, 400)
                    .centerCrop().into(imageView)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context).inflate(R.layout.blogpost_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<BlogPost>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}