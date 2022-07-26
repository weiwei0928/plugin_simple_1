package com.ww.plugin.activity

import android.app.Activity
import android.os.Bundle
import com.ww.plugin.R

class PluginActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}