package com.example.grantappforitacademy.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grantappforitacademy.R
import com.example.grantappforitacademy.common.mvp.BaseFragment
import com.example.grantappforitacademy.databinding.FragmentNewsBinding
import com.example.grantappforitacademy.main.ui.blogposts.blog_post.BlogpostsFragment
import com.example.grantappforitacademy.main.ui.business_adverts.business_adverts.BusinessAdvertsFragment
import com.example.grantappforitacademy.main.ui.events.event.EventFragment
import com.example.grantappforitacademy.main.ui.links.LinksFragment
import com.example.grantappforitacademy.main.ui.newsletter_list.NewsletterListFragment
import com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_fragment.ProviderAdvertsFragment
import com.example.grantappforitacademy.main.ui.question_and_answers.queston_and_answer_fragment.QuestionAndAnswersFragment
import com.example.grantappforitacademy.main.ui.sector.SectorFragment
import com.example.grantappforitacademy.main.ui.subscribe.SubscribeFragment
import com.example.grantappforitacademy.main.ui.unsubscribe.UnSubscribeFragment
import com.example.grantappforitacademy.main.ui.users.user_business_fragment.UserBusinessFragment
import com.example.grantappforitacademy.main.ui.users.user_provider_fragment.UserProviderFragment
import com.example.grantappforitacademy.main.ui.users.user_register.user_register_business_fragment.UserRegisterBusinessFragment
import com.example.grantappforitacademy.main.ui.users.user_register.user_register_provider_fragment.UserRegisterProviderFragment

private lateinit var binding: FragmentNewsBinding

class NewsFragment : BaseFragment(R.layout.fragment_main) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            blogposts.setOnClickListener {
                changeFragment(BlogpostsFragment(), R.id.frame_layout)
            }
            events.setOnClickListener {
                changeFragment(EventFragment(), R.id.frame_layout)
            }
            businessAdvert.setOnClickListener {
                changeFragment(BusinessAdvertsFragment(), R.id.frame_layout)
            }
            links.setOnClickListener {
                changeFragment(LinksFragment(), R.id.frame_layout)
            }
            newsletterList.setOnClickListener {
                changeFragment(NewsletterListFragment(), R.id.frame_layout)
            }
            provideradverts.setOnClickListener {
                changeFragment(ProviderAdvertsFragment(), R.id.frame_layout)
            }
            questionAndAnswers.setOnClickListener {
                changeFragment(QuestionAndAnswersFragment(), R.id.frame_layout)
            }
            sector.setOnClickListener {
                changeFragment(SectorFragment(), R.id.frame_layout)
            }
            subcribe.setOnClickListener {
                changeFragment(SubscribeFragment(), R.id.frame_layout)
            }
            unSubscribe.setOnClickListener {
                changeFragment(UnSubscribeFragment(), R.id.frame_layout)
            }
            usersBusiness.setOnClickListener {
                changeFragment(UserBusinessFragment(), R.id.frame_layout)
            }
            usersProvide.setOnClickListener {
                changeFragment(UserProviderFragment(), R.id.frame_layout)
            }
            registerBusiness.setOnClickListener {
                changeFragment(UserRegisterBusinessFragment(), R.id.frame_layout)
            }
            registerProvide.setOnClickListener {
                changeFragment(UserRegisterProviderFragment(), R.id.frame_layout)
            }

        }
    }
}