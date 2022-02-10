package com.example.grantappforitacademy.adapter.adapter_event

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.databinding.EventViewBinding
import com.example.grantappforitacademy.responsemodel.Event
import com.squareup.picasso.Picasso


class AdapterForEvent(private val onClick: (Event) -> Unit) :
    RecyclerView.Adapter<AdapterForEvent.ViewHolder>() {
    private val data = mutableListOf<Event>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = EventViewBinding.bind(item)


        fun bind(item: Event) {
            with(binding) {
                itemView.setOnClickListener { (onClick.invoke(item)) }
                titleTextView.text = item.name
                location.text = item.location
                format.text = item.eventFormat
                Picasso.get().load(item.eventImage).resize(400, 400)
                    .centerCrop().into(imageView)

            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            LayoutInflater.from(parent.context).inflate(R.layout.event_view, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list: List<Event>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()//read about this
    }
}