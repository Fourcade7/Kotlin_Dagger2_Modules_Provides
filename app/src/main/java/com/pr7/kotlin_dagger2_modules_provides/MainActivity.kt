package com.pr7.kotlin_dagger2_modules_provides

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pr7.kotlin_dagger2_modules_provides.Injector.component
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
//    @Inject
//    lateinit var chrome: Chrome
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        component.inject(this@MainActivity)
//        chrome.youTube.videoplaying()

     val google=Google()

    }
}