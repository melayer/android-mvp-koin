package com.melayer.homeautomation.login.data.source

import com.melayer.homeautomation.login.data.Login
import io.reactivex.Single

/**
 * Created by aniruddha on 21/3/18.
 */
interface LoginDataSource {

    fun login(userName: String, password: String): Single<Login>

    fun login(json: String): Single<Login>
}