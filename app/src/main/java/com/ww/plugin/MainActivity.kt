package com.ww.plugin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import zeus.plugin.PluginManager
import zeus.plugin.ZeusBaseActivity


class MainActivity : ZeusBaseActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: ")
        //val version = "1";
        val version = "版本2"

        title = "插件,版本为$version"

        main_tv.text = "这是插件,版本为$version"

        main_tv.setOnClickListener {
            var intent = Intent(MainActivity@ this, TestPluginActivity::class.java)
            startActivity(intent)
        }
        btn.setOnClickListener {
            val startIntent = Intent(this, MyService::class.java)
            //启动服务
            PluginManager.startService(startIntent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }
}