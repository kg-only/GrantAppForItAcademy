package com.example.grantappforitacademy.main.ui

import com.example.grantappforitacademy.interactor.Interactor
import com.example.grantappforitacademy.main.ui.blogposts.blog_create_comment.BlogCreateCommentPresenter
import com.example.grantappforitacademy.main.ui.blogposts.blog_post.BlogpostsPresenter
import com.example.grantappforitacademy.main.ui.business_adverts.business_adverts.BusinessAdvertsPresenter
import com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_comment.BusinessAdvertsCommentPresenter
import com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_comment_post.BusinessAdvertsCreateCommentPresenter
import com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_post.BusinessAdvertsPostPresenter
import com.example.grantappforitacademy.main.ui.business_adverts.business_adverts_update_put.BusinessAdvertsPutPresenter
import com.example.grantappforitacademy.main.ui.events.create_event_comment.EventCommentPresenter
import com.example.grantappforitacademy.main.ui.events.event.EventPresenter
import com.example.grantappforitacademy.main.ui.grants.grant_comment_create.GrantCommentCreatePresenter
import com.example.grantappforitacademy.main.ui.grants.grant_fragment.GrantPresenter
import com.example.grantappforitacademy.main.ui.links.LinksPresenter
import com.example.grantappforitacademy.main.ui.newsletter_list.NewsletterListPresenter
import com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_comment_create.ProviderAdvertsCommentCreatePresenter
import com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_fragment.ProviderAdvertsPresenter
import com.example.grantappforitacademy.main.ui.provider_adverts.provider_adverts_post_fragment.ProviderAdvertsPostPresenter
import com.example.grantappforitacademy.main.ui.question_and_answers.question_and_answers_create_fragment.QuestionAndAnswersCreatePresenter
import com.example.grantappforitacademy.main.ui.question_and_answers.queston_and_answer_fragment.QuestionAndAnswersPresenter
import com.example.grantappforitacademy.main.ui.sector.SectorPresenter
import com.example.grantappforitacademy.main.ui.subscribe.SubscribePresenter
import com.example.grantappforitacademy.main.ui.unsubscribe.UnSubscribePresenter
import com.example.grantappforitacademy.main.ui.users.user_business_fragment.UserBusinessPresenter
import com.example.grantappforitacademy.main.ui.users.user_provider_fragment.UserProviderPresenter
import com.example.grantappforitacademy.main.ui.users.user_register.user_register_business_fragment.UserRegisterBusinessPresenter
import com.example.grantappforitacademy.main.ui.users.user_register.user_register_provider_fragment.UserRegisterProviderPresenter
import com.example.grantappforitacademy.main.ui.write_us.WriteUsPresenter
import org.koin.core.module.Module
import org.koin.dsl.module

object MainModule {
    fun create(): Module = module {
        single { Interactor(get()) }
        //blogpost
        factory { BlogpostsPresenter(get()) }
        factory { BlogCreateCommentPresenter(get()) }
        //businessAdvert
        factory { BusinessAdvertsPresenter(get()) }
        factory { BusinessAdvertsPostPresenter(get()) }
        factory { BusinessAdvertsCommentPresenter(get()) }
        factory { BusinessAdvertsCreateCommentPresenter(get()) }
        factory { BusinessAdvertsPutPresenter(get()) }
        //events
        factory { EventPresenter(get()) }
        factory { EventCommentPresenter(get()) }
        //grant
        factory { GrantPresenter(get()) }
        factory { GrantCommentCreatePresenter(get()) }
        //links
        factory { LinksPresenter(get()) }
        //newsletter_list
        factory { NewsletterListPresenter(get()) }
        //provider adverts
        factory { ProviderAdvertsPresenter(get()) }
        factory { ProviderAdvertsPostPresenter(get()) }
        factory { ProviderAdvertsCommentCreatePresenter(get()) }
        //questions and answers
        factory { QuestionAndAnswersPresenter(get()) }
        factory { QuestionAndAnswersCreatePresenter(get()) }
        //sector
        factory { SectorPresenter(get()) }
        //skill

        //subscribe
        factory { SubscribePresenter(get()) }
        //subscribe
        factory { UnSubscribePresenter(get()) }
        //users
        factory { UserBusinessPresenter(get()) }
        factory { UserProviderPresenter(get()) }
        factory { UserRegisterBusinessPresenter(get()) }
        factory { UserRegisterProviderPresenter(get()) }
        //write us
        factory { WriteUsPresenter(get()) }
    }
}