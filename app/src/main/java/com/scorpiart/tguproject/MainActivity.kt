package com.scorpiart.tguproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun clickRedTable(view: View){

        val openRed = Intent(this, Choise_red::class.java)
        startActivity(openRed)

    }

    fun clickBlueTable(view: View){

        val openBlue = Intent(this, Choise_blue::class.java)
        startActivity(openBlue)

    }

}