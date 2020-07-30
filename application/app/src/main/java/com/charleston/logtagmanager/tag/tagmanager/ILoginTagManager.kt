package com.charleston.logtagmanager.tag.tagmanager

interface ILoginTagManager {
    fun logStartedScreen()
    fun logCloseScreen()
    fun logLoginClick(user: String)
}