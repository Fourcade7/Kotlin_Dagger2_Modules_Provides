package com.pr7.kotlin_dagger2_modules_provides

object Injector {

    val component=DaggerGoogleComponent.create()
}