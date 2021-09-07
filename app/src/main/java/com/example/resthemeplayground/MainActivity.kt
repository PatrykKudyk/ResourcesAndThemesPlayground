package com.example.resthemeplayground

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.resthemeplayground.databinding.ActivityMainBinding
import com.example.resthemeplayground.enums.ThemeEnum
import com.example.resthemeplayground.helpers.ThemeHelper

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setCorrectTheme()
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    private fun setCorrectTheme() {
        when (ThemeHelper.theme){
            ThemeEnum.Default -> setTheme(R.style.AppThemeDefault)
            ThemeEnum.Light -> setTheme(R.style.AppThemeDefault)
            ThemeEnum.Dark -> setTheme(R.style.AppThemeDefault)
            ThemeEnum.Green -> setTheme(R.style.AppThemeDefault)
            ThemeEnum.Red -> setTheme(R.style.AppThemeDefault)
            ThemeEnum.Rasta -> setTheme(R.style.AppThemeDefault)
        }
    }
}