package com.example.grantappforitacademy.main.ui.createeventcomment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.adapter.AdapterForEventComment
import com.example.grantappforitacademy.common.mvp.BaseFragmentMvp
import com.example.grantappforitacademy.databinding.FragmentEventCommentBinding
import com.example.grantappforitacademy.main.ui.eventsfragment.EventContract
import com.example.grantappforitacademy.responsemodel.EventComment
import com.example.grantappforitacademy.responsemodel.EventCommentPost
import com.example.grantappforitacademy.responsemodel.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

private lateinit var binding: FragmentEventCommentBinding
private lateinit var adapter: AdapterForEventComment

class EventCommentFragment : BaseFragmentMvp<EventCommentContract.View,
        EventCommentContract.Presenter>(R.layout.fragment_event), EventCommentContract.View {

    override val presenter: EventCommentPresenter by inject()
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentEventCommentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView()
        binding.postBtn.setOnClickListener {

                val post = binding.post.text.toString().toInt()
                val text = binding.textWrite.text.toString()
                presenter.getDataFromApi(
                    eventCommentPost = EventCommentPost(post = post,
                        text = text, user = User(id = 1, firstName = "first", lastName = "last")))

        }

    }

    override fun getResultList(data: List<EventComment>) {

        adapter.setItems(data)
    }

    private fun recyclerView() {
        adapter = AdapterForEventComment()
        binding.recyclerEventsComment.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerEventsComment.adapter = adapter
    }
}