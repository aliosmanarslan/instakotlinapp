package com.aliosmanarslan.instakotlinapp.Home


/**
 * Created by Ali Osman ARSLAN on 17.05.2020.
 * info@aliosmanarslan.com
 */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aliosmanarslan.instakotlinapp.R
import com.aliosmanarslan.instakotlinapp.utils.ButtomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val ACTIVITY_NO = 0
    private val TAG = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
