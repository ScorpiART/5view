package com.scorpiart.tguproject

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Choise_blue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.blue_choise)
    }

    fun backFromBlue(view: View){
        finish()
    }
}