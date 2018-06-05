package com.melayer.homeautomation.login.mvp

import android.util.Log
import com.melayer.homeautomation.login.data.LoginRepository

/**
 * Created by aniruddha on 21/3/18.
 */
class LoginPresenter(
    private val loginRepository: LoginRepository
) : LoginContract.Presenter {

    override lateinit var view: LoginContract.View

    override fun makeLogin() {
        Log.i("@melayer", "Login Made")

        loginRepository.login("").subscribe {
            dt ->
        }
    }

    override fun start() {
        Log.i("@melayer", "Started")
    }
}
