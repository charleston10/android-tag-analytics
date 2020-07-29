package com.charleston.logtagmanager.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.charleston.logtagmanager.R
import com.charleston.logtagmanager.tag.tagmanager.IEntranceTagManager
import org.koin.android.ext.android.inject

class RegisterFragment : Fragment(R.layout.fragment_register) {

    private val tagManager by inject<IEntranceTagManager>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tagManager.register.logStartedScreen()
    }

    override fun onStop() {
        tagManager.register.logCloseScreen()
        super.onStop()
    }
}