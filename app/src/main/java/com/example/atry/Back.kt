package com.example.atry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.atry.databinding.FragmentBackBinding
import com.example.atry.databinding.FragmentTitleBinding


class Back : Fragment() {
    private lateinit var binding: FragmentBackBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentBackBinding>(inflater,
            R.layout.fragment_back,container,false)

        binding.button.setOnClickListener {

            view?.findNavController()?.navigate(R.id.action_back_to_titleFragment)
        }
        return binding.root
    }


}


