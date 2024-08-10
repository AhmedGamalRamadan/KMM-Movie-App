package com.example.multiplatformapp.util

import com.example.multiplatformapp.di.getSharedModules
import org.koin.core.context.startKoin

fun initKoin(){
    startKoin {
        modules(getSharedModules())
    }
}