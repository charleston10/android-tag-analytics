package com.charleston.logtagmanager.tag.logger

import android.util.Log

class Logger : ILogger {

    override fun log(key: String, value: String) {
        Log.d(key, value)
    }
}