package com.example.gps_android_tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gps_android_tugas.databinding.ActivityUtamaBinding

class UtamaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUtamaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUtamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMaps.setOnClickListener {
            val inten = Intent(this, MapsActivity::class.java)
            startActivity(inten)
        }

        binding.btnSensor.setOnClickListener {
            val inten1 = Intent(this, SensorActivity::class.java)
            startActivity(inten1)
        }
    }
}