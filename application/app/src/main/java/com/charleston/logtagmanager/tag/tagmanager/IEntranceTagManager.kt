package com.charleston.logtagmanager.tag.tagmanager

interface IEntranceTagManager {
    val login: ILoginTagManager
    val register: IRegisterTagManager
}