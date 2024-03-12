package com.example.myAssignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a2.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            // 튜터님께서 알려준 쓰레드?
        }

    }
}