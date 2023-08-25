package com.prateek.vistaraair.ui.tv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.prateek.vistaraair.databinding.FragmentTvBinding

class TVFragment : Fragment() {

    private var _binding: FragmentTvBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val tvViewModel = ViewModelProvider(this)[TVViewModel::class.java]

        _binding = FragmentTvBinding.inflate(inflater, container, false)

        tvViewModel.text.observe(viewLifecycleOwner) {
            binding.textViewTv.text = it
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}