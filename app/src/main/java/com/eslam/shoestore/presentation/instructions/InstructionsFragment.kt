package com.eslam.shoestore.presentation.instructions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.eslam.shoestore.databinding.FragmentInstructionsBinding
import com.eslam.shoestore.databinding.FragmentLoginBinding

class InstructionsFragment : Fragment() {

    private val binding by lazy { FragmentInstructionsBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root: View = binding.root

        binding.navigateToShoeListButton.setOnClickListener {
            navigateToShoeListScreen()
        }

        return root
    }

    private fun navigateToShoeListScreen() {
        findNavController().navigate(InstructionsFragmentDirections.actionInstructionsFragmentToShoeListFragment())
    }

}