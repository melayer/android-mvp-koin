package com.melayer.homeautomation.login.data

import com.melayer.homeautomation.login.data.source.LoginDataSource
import com.melayer.homeautomation.login.data.source.local.LoginLocalDataSource
import com.melayer.homeautomation.login.data.source.remote.LoginRemoteDataSource
import io.reactivex.Single

/**
 * Created by aniruddha on 21/3/18.
 */
class LoginRepository(
        private val localData: LoginLocalDataSource,
        private val remoteData: LoginRemoteDataSource
) : LoginDataSource {

    override fun login(userName: String, password: String): Single<Login> =
            remoteData.login(userName, password)

    override fun login(json: String): Single<Login> = remoteData.login(json)
}