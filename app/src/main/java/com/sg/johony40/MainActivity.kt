package com.sg.johony40

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.sg.johony40.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabBtn.setOnClickListener {
            val intent=Intent(this,AddThoughtActivity::class.java)
           Log.i(TAG,"Inside fab")
            startActivity(intent)
        }
    }




}