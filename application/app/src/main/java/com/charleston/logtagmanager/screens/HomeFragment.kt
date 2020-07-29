package com.charleston.logtagmanager.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.charleston.logtagmanager.R
import com.charleston.logtagmanager.tag.tagmanager.IEntranceTagManager
import com.charleston.logtagmanager.tag.tagmanager.IHomeTagManager
import org.koin.android.ext.android.inject

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val tagManager by inject<IHomeTagManager>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tagManager.logStartedScreen()
    }

    override fun onStop() {
        tagManager.logCloseScreen()
        super.onStop()
    }
}