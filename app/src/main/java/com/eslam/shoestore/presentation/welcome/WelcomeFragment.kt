package com.eslam.shoestore.presentation.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.eslam.shoestore.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private val binding by lazy { FragmentWelcomeBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root: View = binding.root

        binding.navigateToInstructionsButton.setOnClickListener {
            navigateToInstructionsScreen()
        }

        return root
    }

    private fun navigateToInstructionsScreen() {
        findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToInstructionsFragment())
    }

}