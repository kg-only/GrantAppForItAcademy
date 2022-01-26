package com.example.grantappforitacademy.main.ui

import com.example.grantappforitacademy.interactor.InteractorTestClass
import com.example.grantappforitacademy.main.ui.createeventcomment.EventCommentPresenter
import com.example.grantappforitacademy.main.ui.eventsfragment.EventContract
import com.example.grantappforitacademy.main.ui.eventsfragment.EventPresenter
import com.example.grantappforitacademy.main.ui.grantsfragment.GrantsPresenter
import org.koin.core.module.Module
import org.koin.dsl.bind
import org.koin.dsl.module

object MainModule {
    fun create(): Module = module {
        single { InteractorTestClass(get()) }
        factory { EventPresenter(get()) }
        factory { GrantsPresenter(get()) }
        factory { EventCommentPresenter(get()) }

    }
}