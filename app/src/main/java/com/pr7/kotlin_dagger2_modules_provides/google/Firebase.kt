package com.pr7.kotlin_dagger2_modules_provides

import android.util.Log
import com.pr7.kotlin_dagger2_modules_provides.Constants.TAG

class Firebase  {
    init {
        Log.d(TAG, "Firebase Class has invoked: ")
    }

    fun realtimeDatabase(){
        Log.d(TAG, "realtimeDatabase: is running")
    }

}