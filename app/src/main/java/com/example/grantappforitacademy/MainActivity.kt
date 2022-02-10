package com.example.grantappforitacademy

import android.os.Bundle
import com.example.grantappforitacademy.common.mvp.BaseActivity
import com.example.grantappforitacademy.main.MainFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(MainFragment())
    }
}
