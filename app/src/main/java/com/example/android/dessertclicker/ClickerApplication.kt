package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

/**
 ** create by ErixJavier on  2/04/20.
 */


class ClickerApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}