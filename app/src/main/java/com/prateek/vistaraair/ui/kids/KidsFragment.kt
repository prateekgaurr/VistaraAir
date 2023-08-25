package com.prateek.vistaraair.ui.kids

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.get
import androidx.lifecycle.viewModelScope
import com.prateek.vistaraair.R
import com.prateek.vistaraair.databinding.FragmentKidsBinding

class KidsFragment : Fragment() {

    private var _binding : FragmentKidsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentKidsBinding.inflate(inflater, container, false)

        val viewModel = ViewModelProvider(this)[KidsViewModel::class.java]

        viewModel.text.observe(viewLifecycleOwner){
            binding.textViewKids.text = it
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}