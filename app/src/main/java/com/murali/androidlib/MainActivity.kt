package com.murali.samples.androidlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import com.murali.libraries.androidlib.SampleAndroidLibMain

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialise the main class from the Sample Android Library module
        val sampleAndroidLibMain = SampleAndroidLibMain()
        tv_welcome.text = sampleAndroidLibMain.welcomeString
    }
}
