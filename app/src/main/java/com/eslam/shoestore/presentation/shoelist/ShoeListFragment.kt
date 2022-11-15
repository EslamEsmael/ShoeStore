package com.eslam.shoestore.presentation.shoelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.eslam.shoestore.ShoeViewModel
import com.eslam.shoestore.databinding.FragmentShoeListBinding
import com.eslam.shoestore.databinding.FragmentWelcomeBinding
import com.eslam.shoestore.databinding.ItemShoeBinding

class ShoeListFragment : Fragment() {

    private val viewModel: ShoeViewModel by activityViewModels()
    private val binding by lazy { FragmentShoeListBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root: View = binding.root

        viewModel.shoeList.observe(viewLifecycleOwner) { shoeList ->
            for (item in shoeList) {
                val rowBinding = ItemShoeBinding.inflate(layoutInflater)
                rowBinding.shoe = item
                binding.shoeListLinearLayout.addView(rowBinding.root)
            }
        }

        binding.shoeDetailsFloatingActionButton.setOnClickListener {
            findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToDetailsFragment())
        }


        return root
    }

}
