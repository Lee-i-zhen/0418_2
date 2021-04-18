package com.example.atry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.atry.TitleFragmentArgs.fromBundle
import com.example.atry.databinding.FragmentBackBinding
import com.example.atry.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
            R.layout.fragment_title,container,false)


        val args = TitleFragmentArgs.fromBundle(requireArguments())
        binding.TVShow.text = args.answer
        return binding.root

    }




}