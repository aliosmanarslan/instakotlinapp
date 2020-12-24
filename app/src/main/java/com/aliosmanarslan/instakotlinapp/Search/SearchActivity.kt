package com.aliosmanarslan.instakotlinapp.Search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aliosmanarslan.instakotlinapp.R
import com.aliosmanarslan.instakotlinapp.utils.ButtomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*

class SearchActivity : AppCompatActivity() {
    private val ACTIVITY_NO = 1
    private val TAG = "SearchActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

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