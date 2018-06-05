package com.melayer.homeautomation.login.mvp

import com.melayer.homeautomation.base.BasePresenter
import com.melayer.homeautomation.base.BaseView

/**
 * Created by aniruddha on 21/3/18.
 */
interface LoginContract {

    interface View : BaseView<Presenter> {
        fun doLogin()
    }

    interface Presenter : BasePresenter<View> {
        fun makeLogin()
    }
}