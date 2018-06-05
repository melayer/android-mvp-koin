package com.melayer.homeautomation

import android.app.Application
import org.koin.android.ext.android.startKoin

/**
 * Created by aniruddha on 21/3/18.
 */
class HomeAutomationApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, AppModule)
    }
}