package com.example.grantappforitacademy.adapter.adapter_links

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.EventViewBinding
import com.example.grantappforitacademy.databinding.LinksViewBinding
import com.example.grantappforitacademy.responsemodel.Event
import com.example.grantappforitacademy.responsemodel.Links
import com.squareup.picasso.Picasso


class AdapterForLinks :
    RecyclerView.Adapter<AdapterForLinks.ViewHolder>() {
    private val data = mutableListOf<Links>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = LinksViewBinding.bind(item)


        fun bind(item: Links) {
            with(binding) {
                category.text = item.category
                ruLink.text = item.ruLink
                kgLink.text = item.kgLink

            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context).inflate(R.layout.links_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<Links>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}