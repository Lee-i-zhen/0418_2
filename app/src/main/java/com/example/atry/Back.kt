package com.example.atry

import android.content.Context
import android.os.Bundle
import android.text.Layout
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
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_back,container,false)


        binding.button.setOnClickListener {

            view?.findNavController()
                ?.navigate(BackDirections.actionBackToTitleFragment(addtemp(it)))
        }
        return binding.root
    }

    private fun addtemp(view: View): String {

        binding.apply {
            val a = text1.text.toString()?.toDouble()
            val result = (a - 32) * 5 / 9
//            return "%.2f".format(result)
            return result.toString()

        }

//        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0) // 隱藏鍵盤
    }
}


