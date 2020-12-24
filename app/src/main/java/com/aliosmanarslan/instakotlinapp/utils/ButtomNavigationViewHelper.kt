package com.aliosmanarslan.instakotlinapp.utils

import android.content.Context
import android.content.Intent
import android.view.MenuItem
import com.aliosmanarslan.instakotlinapp.Home.MainActivity
import com.aliosmanarslan.instakotlinapp.News.NewsActivity
import com.aliosmanarslan.instakotlinapp.Profile.ProfileActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
import com.aliosmanarslan.instakotlinapp.R
import com.aliosmanarslan.instakotlinapp.Search.SearchActivity
import com.aliosmanarslan.instakotlinapp.Share.ShareActivity


/**
 * Created by Ali Osman ARSLAN on 19.05.2020.
 * info@aliosmanarslan.com
 */
class ButtomNavigationViewHelper {

    companion object{

        fun setupBottomNavigationView(bottomNavigationViewEx: BottomNavigationViewEx){

            bottomNavigationViewEx.enableAnimation(false)
            bottomNavigationViewEx.setItemHorizontalTranslationEnabled(false);
            bottomNavigationViewEx.enableShiftingMode(false)
            bottomNavigationViewEx.setTextVisibility(false)

        }

        fun setupNavigation(context: Context, buttomBottomNavigationViewEx: BottomNavigationViewEx){

            //her öğeye tıklanıldığında tetiklenecek olan fonksiyon
            buttomBottomNavigationViewEx.onNavigationItemSelectedListener = object : BottomNavigationView.OnNavigationItemSelectedListener{
                override fun onNavigationItemSelected(item: MenuItem): Boolean {

                    when(item.itemId){
                        R.id.ic_home -> {
                            val intent = Intent(context, MainActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                        R.id.ic_search -> {
                            val intent = Intent(context, SearchActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                        R.id.ic_share -> {
                            val intent = Intent(context, ShareActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                        R.id.ic_news -> {
                            val intent = Intent(context, NewsActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                        R.id.ic_profile -> {
                            val intent = Intent(context, ProfileActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
                            context.startActivity(intent)
                            return true
                        }
                    }
                    return false
                }

            }
        }
    }
}