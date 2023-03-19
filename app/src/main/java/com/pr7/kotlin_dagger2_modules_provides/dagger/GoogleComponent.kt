package com.pr7.kotlin_dagger2_modules_provides

import com.pr7.kotlin_dagger2_modules_provides.dagger.ChromeModule
import dagger.Component


@Component(modules = [ChromeModule::class])
interface GoogleComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(google: Google)


}