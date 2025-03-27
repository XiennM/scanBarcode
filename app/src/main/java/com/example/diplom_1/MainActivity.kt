package com.example.diplom_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.diplom_1.databinding.ActivityMainWindowBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_window)

        val btnScan = findViewById<ImageButton>(R.id.btnPhoto)

        btnScan?.setOnClickListener {

            startActivity(Intent(this, ScannerActivity::class.java))

        }

//        val recentVariable: LinearLayout = findViewById(R.id.recentVariable)

    }
}