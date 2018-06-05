package com.melayer.homeautomation.home.mvp

import com.melayer.homeautomation.base.BasePresenter
import com.melayer.homeautomation.base.BaseView

/**
 * Created by aniruddha on 26/3/18.
 */
class HomeContract {

    interface View : BaseView<Presenter> {
        fun openSecond()
    }

    interface Presenter : BasePresenter<View> {
        fun returnToFirst()
    }
}