package com.example.recepiecatalogue.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recepiecatalogue.adapter.RecipeAdapter
import com.example.recepiecatalogue.data.DataRecipe
import com.example.recepiecatalogue.databinding.FragmentDesertBinding
import com.example.recepiecatalogue.databinding.FragmentDesertBinding.inflate

class DesertFragment : Fragment() {

    private var _binding: FragmentDesertBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvDessert.apply {
            layoutManager = GridLayoutManager(activity, 2)
            adapter = RecipeAdapter(DataRecipe.listDessert)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}