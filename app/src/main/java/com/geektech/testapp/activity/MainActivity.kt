package com.geektech.testapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.geektech.testapp.R
import com.geektech.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = findNavController(R.id.nav_host_fragment)
        binding.bottomNavView.background = null
        binding.bottomNavView.menu.getItem(2).isEnabled = false

        navController.addOnDestinationChangedListener{controller, destination, arguments ->
            if(destination.id == R.id.splashScreenFragment){
                binding.cLayout.visibility = View.GONE
                window.statusBarColor = ContextCompat.getColor(applicationContext,R.color.blue)
            }else{
                binding.cLayout.visibility = View.VISIBLE
                window.statusBarColor = ContextCompat.getColor(applicationContext,R.color.light_grey)
            }
        }
    }
}