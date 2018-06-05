package com.melayer.homeautomation.home

import com.melayer.homeautomation.home.mvp.HomeContract
import com.melayer.homeautomation.home.mvp.HomePresenter
import com.melayer.homeautomation.home.ui.OneFragment
import com.melayer.homeautomation.home.ui.TwoFragment
import org.koin.dsl.module.applicationContext

/**
 * Created by aniruddha on 26/3/18.
 */
val HomeModule = applicationContext {

    factory { OneFragment() }
    factory { TwoFragment() }

    factory { HomePresenter() as HomeContract.Presenter }
}