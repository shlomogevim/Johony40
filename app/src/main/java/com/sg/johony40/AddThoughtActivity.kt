package com.sg.johony40

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AddThoughtActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_thought)
    }

    fun funny_AddTought_Onclick(view: View) {}
    fun crazy_AddTought_Onclick(view: View) {}
    fun serious_AddTought_Onclick(view: View) {}
}