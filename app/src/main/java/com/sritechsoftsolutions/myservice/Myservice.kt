package com.sritechsoftsolutions.myservice

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class Myservice:Service() {

    var mPlayer:MediaPlayer?=null
    override fun onBind(intent: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate() {
        super.onCreate()
        mPlayer=MediaPlayer.create(this@Myservice,R.raw.upr)

    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {


        mPlayer?.start()
        return super.onStartCommand(intent, flags, startId)

    }

    override fun onDestroy() {
        super.onDestroy()

        mPlayer?.stop()
    }
}