package com.example.atry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.atry.databinding.ActivityMainBinding
import com.example.atry.databinding.FragmentSecondBinding


class Second : Fragment() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSecondBinding>(inflater,
            R.layout.fragment_second,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("key", "value")
            Navigation.findNavController(it).navigate(R.id.action_second_to_first, bundle)
        }
    }

}