package com.aliosmanarslan.instakotlinapp.Profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aliosmanarslan.instakotlinapp.R
import com.aliosmanarslan.instakotlinapp.utils.ButtomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*

class ProfileActivity : AppCompatActivity() {
    private val ACTIVITY_NO = 4
    private val TAG = "ProfileActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setupNavigationView()
    }

    fun setupNavigationView(){

        ButtomNavigationViewHelper.setupBottomNavigationView(buttomNavigationView)
        ButtomNavigationViewHelper.setupNavigation(context = this, buttomBottomNavigationViewEx = buttomNavigationView)
        var menu = buttomNavigationView.menu
        var menuItem = menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)

    }
}
