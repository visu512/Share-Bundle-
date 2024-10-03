package com.example.sharebundle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get id
        val name = findViewById<TextView>(R.id.name)
        val branch = findViewById<TextView>(R.id.branch)
        val age = findViewById<TextView>(R.id.age)
        val phone = findViewById<TextView>(R.id.phone)
        val button = findViewById<Button>(R.id.button)


        // Get the data when the button is clicked
        button.setOnClickListener {
            val name = name.text.toString()
            val branch = branch.text.toString()
            val age = age.text.toString()
            val phone = phone.text.toString()

            // Go to the details activity
            val intent = Intent(this,MainActivity2::class.java)

            // Pass the data to the next activity
            intent.putExtra("name", name)
            intent.putExtra("branch", branch)
            intent.putExtra("age", age)
            intent.putExtra("phone", phone)

            startActivity(intent)

        }
    }
}
