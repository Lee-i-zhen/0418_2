package com.example.atry

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat.getSystemService
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.atry.databinding.FragmentBackBinding
import com.example.atry.databinding.FragmentTitleBinding


class Back : Fragment() {
    private lateinit var binding:FragmentBackBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentBackBinding>(inflater,
            R.layout.fragment_back,container,false)

        binding.button.setOnClickListener {

            val answer =
                view?.findNavController()?.navigate(R.id.action_back_to_titleFragment)
        }
        return binding.root
    }

    private fun addtemp(view: View): Double {

        binding.apply {
            val a = text1.text.toString()?.toDouble()
            val result = (a - 32) * 5 / 9
//            return "%.2f".format(result)
            return (a - 32) * 5 / 9

        }

//        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0) // 隱藏鍵盤
    }
}


