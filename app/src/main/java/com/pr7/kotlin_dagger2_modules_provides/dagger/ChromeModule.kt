package com.pr7.kotlin_dagger2_modules_provides.dagger

import com.pr7.kotlin_dagger2_modules_provides.Chrome
import com.pr7.kotlin_dagger2_modules_provides.Firebase
import com.pr7.kotlin_dagger2_modules_provides.YouTube
import dagger.Module
import dagger.Provides


@Module
class ChromeModule {

    @Provides
    fun provideFirebase():Firebase{
        return Firebase()
    }

    @Provides
    fun provideYoutube():YouTube=YouTube()

    @Provides
    fun provideChrome(firebase: Firebase,youTube: YouTube):Chrome{
        return Chrome(firebase, youTube)
    }
}