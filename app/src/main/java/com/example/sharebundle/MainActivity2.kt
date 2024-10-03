package com.example.sharebundle

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        // Get references to TextViews using findViewById
        val textView1 = findViewById<TextView>(R.id.text1)
        val textView2 = findViewById<TextView>(R.id.text2)
        val textView3 = findViewById<TextView>(R.id.text3)
        val textView4 = findViewById<TextView>(R.id.text4)

        // Retrieve the data from the intent
        val name = intent.getStringExtra("name")
        val branch = intent.getStringExtra("branch")
        val age = intent.getStringExtra("age")
        val phone = intent.getStringExtra("phone")

        // Set the retrieved data to the TextViews
        textView1.text = "Name: "+ name
        textView2.text = "branch: "+branch
        textView3.text = "age: "+age
        textView4.text = "phone: "+phone

    }
}