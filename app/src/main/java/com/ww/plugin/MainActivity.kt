package com.ww.plugin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: ")
        val version = "版本1.0.1";
//        val version = "版本2"

        title = "插件1,版本为 :$version"

        main_tv.text = "这是插件1,版本为 ：$version"

        main_tv.setOnClickListener {
            var intent = Intent(MainActivity@ this, TestPluginActivity::class.java)
            startActivity(intent)
        }
        test_service.setOnClickListener {
            val startIntent = Intent(this, PluginService::class.java)
            //启动服务
            startService(startIntent)
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