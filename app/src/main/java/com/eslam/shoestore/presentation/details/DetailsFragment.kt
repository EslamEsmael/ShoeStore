package com.eslam.shoestore.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.eslam.shoestore.ShoeViewModel
import com.eslam.shoestore.databinding.FragmentDetailsBinding
import com.eslam.shoestore.domain.entity.Shoe

class DetailsFragment : Fragment() {

    private val viewModel: ShoeViewModel by activityViewModels()

    private val binding by lazy { FragmentDetailsBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root: View = binding.root

        binding.cancelButton.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.saveButton.setOnClickListener {
            val shoe1 = binding.shoe
            val shoe = Shoe(
                name = binding.shoeNameTextInputEditText.text.toString(),
                company = binding.companyNameTextInputEditText.text.toString(),
                size = binding.shoeSizeTextInputEditText.text.toString().toDouble(),
                description = binding.descriptionTextInputEditText.text.toString()
            )
            viewModel.saveShoe(shoe)
            findNavController().navigateUp()
        }

        return root
    }

}