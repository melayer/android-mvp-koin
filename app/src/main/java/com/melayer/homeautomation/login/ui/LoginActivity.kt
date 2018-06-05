package com.melayer.homeautomation.login.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.melayer.homeautomation.R
import com.melayer.homeautomation.login.mvp.LoginContract
import com.melayer.homeautomation.util.replaceFragmentInActivity
import org.koin.android.ext.android.inject

class LoginActivity : AppCompatActivity() {

    private val loginFragment: LoginFragment by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        replaceFragmentInActivity(loginFragment,R.id.frameLayout)
    }
}
