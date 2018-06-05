package com.melayer.homeautomation.login

import com.melayer.homeautomation.login.data.LoginRepository
import com.melayer.homeautomation.login.data.source.local.LoginLocalDataSource
import com.melayer.homeautomation.login.data.source.remote.LoginRemoteDataSource
import com.melayer.homeautomation.login.mvp.LoginContract
import com.melayer.homeautomation.login.mvp.LoginPresenter
import com.melayer.homeautomation.login.ui.LoginFragment
import org.koin.dsl.module.applicationContext

/**
 * Created by aniruddha on 21/3/18.
 */

val LoginModule = applicationContext {

    factory { LoginFragment() }
    factory { LoginPresenter(get()) as LoginContract.Presenter }

    bean("loginLocalDataSource") { LoginLocalDataSource() }
    bean("remoteDataSource") { LoginRemoteDataSource() }
    bean {
        LoginRepository(
                get("loginLocalDataSource"),
                get("remoteDataSource")
        )
    }
}