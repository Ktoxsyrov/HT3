package com.example.myapplication.Constraints

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R

class ConstraintYa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_ya)
        supportActionBar?.hide()
        findViewById<TextView>(R.id.playlist).isSelected = true
        findViewById<TextView>(R.id.songName).isSelected = true
    }
}