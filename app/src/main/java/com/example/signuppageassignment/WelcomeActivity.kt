package com.example.signuppageassignment



import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    private lateinit var tvWelcome: TextView
    private lateinit var tvDetails: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        tvWelcome = findViewById(R.id.tv_welcome)
        tvDetails = findViewById(R.id.tv_details)

        val username = intent.getStringExtra("USERNAME")
        val password = intent.getStringExtra("PASSWORD")

        tvWelcome.text = "Welcome, $username!"
        tvDetails.text = "Your password is: $password"
    }
}
