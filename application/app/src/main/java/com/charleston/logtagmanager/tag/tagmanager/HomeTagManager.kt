package com.charleston.logtagmanager.tag.tagmanager

import com.charleston.logtagmanager.tag.logger.ILogger

class HomeTagManager(
    private val logger: ILogger
) : IHomeTagManager {

    override fun logStartedScreen() {
        logger.log("home", "started")
    }

    override fun logCloseScreen() {
        logger.log("home", "closed")
    }
}