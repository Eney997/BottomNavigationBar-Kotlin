package com.example.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContView) as? androidx.navigation.fragment.NavHostFragment
        val navController = navHostFragment?.navController

        if (navController != null) {
            bottomNavigationView.setupWithNavController(navController)
        }

    }
}