package com.pr7.kotlin_dagger2_modules_provides

import javax.inject.Inject


class Google {

    @Inject
    lateinit var chrome: Chrome

    init {
     val component=Injector.component.inject(this)
    }


}