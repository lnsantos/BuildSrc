package com.lnsantos.openway

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.lnsantos.openway.databinding.ActivityMainBinding
import com.lnsantos.openway.main.MainViewController
import com.lnsantos.openway.pages.splash.SplashFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(onInitView())

        MainViewController(binding)
                .initialization(supportFragmentManager)
                .replacePage(SplashFragment())

    }

    private fun onInitView(): View? {
        binding = ActivityMainBinding.inflate(layoutInflater)
        return binding.root
    }

}