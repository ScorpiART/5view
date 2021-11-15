package com.scorpiart.tguproject

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Choise_red : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.red_choise)
    }


    fun backFromRed (view: View){
        finish()
    }
}