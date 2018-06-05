package com.melayer.homeautomation.login.ui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.melayer.homeautomation.R
import com.melayer.homeautomation.login.mvp.LoginContract
import org.koin.android.ext.android.inject


/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment(), LoginContract.View {

    override val presenter: LoginContract.Presenter by inject()

    override fun doLogin() {
        presenter.start()

        presenter.makeLogin()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        doLogin()

        return inflater.inflate(R.layout.fragment_login, container, false)
    }
}
