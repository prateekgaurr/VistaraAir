package com.prateek.vistaraair.ui.audio

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.prateek.vistaraair.R
import com.prateek.vistaraair.databinding.FragmentAudioBinding
import com.prateek.vistaraair.databinding.FragmentMoviesBinding

class AudioFragment : Fragment() {

    private var _binding: FragmentAudioBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val audioViewModel = ViewModelProvider(this)[AudioViewModel::class.java]
        _binding = FragmentAudioBinding.inflate(inflater, container, false)

        audioViewModel.text.observe(viewLifecycleOwner){
            binding.textViewAudio.text = it
        }


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}