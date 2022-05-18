package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.myapplication.Constraints.ConstraintCalc
import com.example.myapplication.Constraints.ConstraintFb
import com.example.myapplication.Constraints.ConstraintYa

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }



    fun YaCons(view: View) {
        val intent = Intent(this, ConstraintYa::class.java)
        startActivity(intent)
    }
    fun FBCons(view: View) {
        val intent = Intent(this, ConstraintFb::class.java)
        startActivity(intent)
    }
    fun FBNoCons(view: View) {
        val intent = Intent(this, NoConstraintFb::class.java)
        startActivity(intent)
    }
    fun CalcCons(view: View) {
        val intent = Intent(this, ConstraintCalc::class.java)
        startActivity(intent)
    }
}