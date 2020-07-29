package com.charleston.logtagmanager

import android.app.Application
import com.charleston.logtagmanager.di.logModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AndroidApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@AndroidApplication)
            modules(logModule)
        }
    }
}