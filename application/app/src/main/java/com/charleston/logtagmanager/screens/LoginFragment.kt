package com.charleston.logtagmanager.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.charleston.logtagmanager.R
import com.charleston.logtagmanager.tag.tagmanager.IEntranceTagManager
import kotlinx.android.synthetic.main.fragment_login.*
import org.koin.android.ext.android.inject

class LoginFragment : Fragment(R.layout.fragment_login) {

    private val tagManager by inject<IEntranceTagManager>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tagManager.login.logStartedScreen()

        button2.setOnClickListener {
            tagManager.login.logLoginClick(txt_login.text.toString())
            findNavController().navigate(R.id.action_loginFragment_to_main_navigation)
        }
        button3.setOnClickListener { findNavController().navigate(R.id.action_loginFragment_to_registerFragment) }
    }

    override fun onStop() {
        tagManager.login.logCloseScreen()
        super.onStop()
    }
}
