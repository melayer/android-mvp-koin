package com.melayer.homeautomation.login.data.source.remote

import com.github.kittinunf.fuel.gson.gsonDeserializerOf
import com.github.kittinunf.fuel.httpPost
import com.github.kittinunf.fuel.rx.rx_object
import com.melayer.homeautomation.login.data.Login
import com.melayer.homeautomation.login.data.source.LoginDataSource
import io.reactivex.Single

/**
 * Created by aniruddha on 21/3/18.
 */
class LoginRemoteDataSource : LoginDataSource {

    override fun login(json: String): Single<Login> =
            "".httpPost().rx_object(gsonDeserializerOf<Login>()).map { it.component1()  }

    override fun login(userName: String, password: String): Single<Login> {
        return Single.just(Login("",""))
    }
}