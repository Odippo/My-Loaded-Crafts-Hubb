package com.example.craftshub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.craftshub.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRegisterBinding
    private lateinit var firebaseAuth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()

        binding.button.setOnClickListener {
            val email = binding.mEmailEt.text.toString()
            val id = binding.mIdET.text.toString()
            if (email.isNotEmpty() && id.isNotEmpty()){

                firebaseAuth.createUserWithEmailAndPassword(email , id).addOnCompleteListener {
                    if(it.isSuccessful){
                        val intent = Intent(this , QueryActivity::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this, it.exception.toString() , Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                Toast.makeText(this , "Fill In All The Fields!" , Toast.LENGTH_SHORT).show()
            }
        }
    }
}
