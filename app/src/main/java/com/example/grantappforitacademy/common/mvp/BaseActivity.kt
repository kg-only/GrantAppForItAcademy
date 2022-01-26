package com.example.grantappforitacademy.common.mvp

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.grantappforitacademy.R

abstract class BaseActivity : AppCompatActivity() {

    fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, fragment)
        transaction.commit()
    }
}