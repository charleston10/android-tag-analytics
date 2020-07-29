package com.charleston.logtagmanager.tag.tagmanager

import com.charleston.logtagmanager.tag.logger.ILogger

class EntranceTagManager(
    private val logger: ILogger
) : IEntranceTagManager {

    override val login: ILoginTagManager get() = LoginTagManager()
    override val register: IRegisterTagManager get() = RegisterTagManager()

    private inner class RegisterTagManager : IRegisterTagManager {

        override fun logStartedScreen() {
            logger.log("register", "started")
        }

        override fun logCloseScreen() {
            logger.log("register", "closed")
        }
    }

    private inner class LoginTagManager : ILoginTagManager {

        override fun logStartedScreen() {
            logger.log("login", "started")
        }

        override fun logCloseScreen() {
            logger.log("login", "closed")
        }
    }
}