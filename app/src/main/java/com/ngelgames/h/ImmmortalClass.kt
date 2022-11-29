package com.ngelgames.h

import android.app.Application
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import java.util.*

class ImmmortalClass : Application() {


    companion object {
        const val dfwthyhyj = "31474270784132290755"
        const val jglfkdkdkgjd = "688d1084-968d-46e0-a27c-fb5c659ec6cd"
        var appsCheckgt = "appsChecker"
        var C1gtgt: String? = "c11"
        var myIDgtgtt: String? = "myID"
        var instIdgtgttg: String? = "instID"
        var linkkkkk = "link"
        var MAIN_IDgtgtt: String? = ""
    }

    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(jglfkdkdkgjd)

        Hawk.init(this).build()


        val settings = getSharedPreferences("PREFS_NAME", 0)

        val trackerParams = MyTracker.getTrackerParams()
        val trackerConfig = MyTracker.getTrackerConfig()
        val instID = MyTracker.getInstanceId(this)
        trackerConfig.isTrackingLaunchEnabled = true
        if (settings.getBoolean("my_first_time", true)) {
            val IDIN = UUID.randomUUID().toString()
            trackerParams.setCustomUserId(IDIN)
            Hawk.put(myIDgtgtt, IDIN)
            Hawk.put(instIdgtgttg, instID)
            settings.edit().putBoolean("my_first_time", false).apply()

        } else {
            val IDINgtgttg = Hawk.get(myIDgtgtt, "null")
            trackerParams.setCustomUserId(IDINgtgttg)
        }
        MyTracker.initTracker(dfwthyhyj, this)

    }


}
