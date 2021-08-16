package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //vo status bar ko hatana hai abhi apne ko

        //LINE ISILIYE KYUKI VO DEPRICATED HAI
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN


    }
}