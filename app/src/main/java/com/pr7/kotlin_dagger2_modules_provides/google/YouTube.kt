package com.pr7.kotlin_dagger2_modules_provides

import android.util.Log
import com.pr7.kotlin_dagger2_modules_provides.Constants.TAG


class YouTube{
    init {
        Log.d(TAG, "Youtube class has invoked: ")
    }

    //method injection automatically called fun

    fun videoplaying(){
        Log.d(TAG, "videoplaying video is playing...: ")
    }
}