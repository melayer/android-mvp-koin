package com.melayer.homeautomation.login.data.source.local

import com.melayer.homeautomation.login.data.Login
import com.melayer.homeautomation.login.data.source.LoginDataSource
import io.reactivex.Single

/**
 * Created by aniruddha on 21/3/18.
 */
class LoginLocalDataSource : LoginDataSource {
    override fun login(userName: String, password: String): Single<Login> {
        return Single.just(Login("",""))
    }

    override fun login(json: String): Single<Login> {
        return Single.just(Login("",""))
    }
}