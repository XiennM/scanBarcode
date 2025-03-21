package com.example.diplom_1

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.diplom_1.databinding.ActivityMainWindowBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainWindowBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("null ActivityMainWindow")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        _binding = ActivityMainWindowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main_window)


//        val recentVariable: LinearLayout = findViewById(R.id.recentVariable)



    }
}