package com.lnsantos.openway.main

import android.os.Handler
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.lnsantos.openway.R
import com.lnsantos.openway.databinding.ActivityMainBinding
import com.lnsantos.openway.pages.AboutFragment

class MainViewController(
    private val binding: ActivityMainBinding
) : MainViewState{

    private val duration : Long = 3000
    private lateinit var mFragment: FragmentManager

    fun initialization(fragmentManager: FragmentManager) : MainViewController{
        mFragment = fragmentManager
        Handler().postDelayed({ render(MainState.done) }, duration)
        return this
    }

    fun replacePage(fragment: Fragment){
        mFragment.beginTransaction().apply {
            replace(binding.parentCurrentPage.id, fragment)
            commit()
        }
    }

    override fun splashDone(state: Boolean) {
        if (state) replacePage(AboutFragment())
    }

}