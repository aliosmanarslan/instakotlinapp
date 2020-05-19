package com.aliosmanarslan.instakotlinapp.utils

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx


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
    }
}