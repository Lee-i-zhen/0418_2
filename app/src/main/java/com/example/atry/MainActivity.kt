package com.example.atry

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.atry.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val navController = this.findNavController(R.id.myNavHostFragment)

        NavigationUI.setupActionBarWithNavController(this,navController)
        ///// 設定up button(返回鈕）/////
//        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,
//            R.layout.activity_main)

        drawerLayout = binding.drawerLayout
        NavigationUI.setupWithNavController(binding.navView, navController)

        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }

//    private fun addtemp(view: View) {
//
//        binding.apply {
//            val a = text1.text.toString()?.toDouble()
//            val result = (a - 32) * 5 / 9
//            textView3.text = "%.2f".format(result)
//
//        }
//
//        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0) // 隱藏鍵盤
//    }
}