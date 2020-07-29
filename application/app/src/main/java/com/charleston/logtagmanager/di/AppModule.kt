package com.charleston.logtagmanager.di

import com.charleston.logtagmanager.tag.logger.ILogger
import com.charleston.logtagmanager.tag.logger.Logger
import com.charleston.logtagmanager.tag.tagmanager.EntranceTagManager
import com.charleston.logtagmanager.tag.tagmanager.HomeTagManager
import com.charleston.logtagmanager.tag.tagmanager.IEntranceTagManager
import com.charleston.logtagmanager.tag.tagmanager.IHomeTagManager
import org.koin.dsl.module

val logModule = module {
    single<ILogger> { Logger() }
    single<IEntranceTagManager> { EntranceTagManager(get()) }
    single<IHomeTagManager> { HomeTagManager(get()) }
}