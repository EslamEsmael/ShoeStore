package com.eslam.shoestore.presentation.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.eslam.shoestore.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private val binding by lazy { FragmentLoginBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root: View = binding.root

        binding.newLoginButton.setOnClickListener {
            navigateToWelcomeScreen()
        }

        binding.loginWithExistingButton.setOnClickListener {
            navigateToWelcomeScreen()
        }

        return root
    }

    private fun navigateToWelcomeScreen() {
        //Todo navigate to welcome screen
        findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
    }

}