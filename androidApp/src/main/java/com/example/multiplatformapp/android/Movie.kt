package com.example.multiplatformapp.android

import android.app.Application
import com.example.multiplatformapp.android.di.appModule
import com.example.multiplatformapp.di.getSharedModules
import org.koin.core.context.startKoin


class Movie: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}