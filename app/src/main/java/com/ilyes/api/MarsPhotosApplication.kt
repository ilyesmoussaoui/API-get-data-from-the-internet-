package com.ilyes.api

import android.app.Application
import com.ilyes.api.data.AppContainer
import com.ilyes.api.data.DefaultAppContainer

class MarsPhotosApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
