package com.example.katakuranatsumi.myomikujiapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getOmikujiButton.setOnClickListener {
//            Log.v("MainActivity", "Button Clicked")

            val results = arrayOf("大吉","中吉","吉","小吉","凶")

            val n = Random().nextInt(results.count())

            if (n == 0){
                resultTextview.setTextColor(Color.RED)

            } else{
                resultTextview.setTextColor(Color.BLUE)
            }

            resultTextview.text = results.get(n)
        }
    }
}
