package com.example.craftshub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    // Initiate late init Var
    lateinit var mSignup:Button
    lateinit var mSignIn:Button
    lateinit var mQuery:TextView
    lateinit var mAsk:TextView
    lateinit var mAuth: FirebaseAuth
    // Firebase
    private lateinit var database: FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAuth = Firebase.auth
        // Initialize Firebase
        FirebaseApp.initializeApp(this)
        FirebaseDatabase.getInstance().setPersistenceEnabled(true)
        database = FirebaseDatabase.getInstance()
        val myDataRef = database.reference.child("data")

        // Example: Writing a single value
        myDataRef.setValue("Hello, Firebase!")

        // Example: Writing multiple values
        val dataMap = HashMap<String, Any>()
        dataMap["name"] = "John Doe"
        dataMap["age"] = 25
        dataMap["email"] = "john.doe@example.com"
        myDataRef.updateChildren(dataMap)
        // Find the views by ID's
        mSignup = findViewById(R.id.mBtnSignup)
        mSignIn = findViewById(R.id.mBtnSignIn)
        mQuery = findViewById(R.id.mTvQuery)
        mAsk = findViewById(R.id.mtvAsk)

        // Set OnClickListener to the Signup and Sign in button

        mSignup.setOnClickListener {
            val signup = Intent(this@MainActivity, SignUpActivity::class.java)
            startActivity(signup)
        }
        mSignIn.setOnClickListener {
            val sign = Intent(this@MainActivity, SignInActivity::class.java)
            startActivity(sign)
        }
    }
}