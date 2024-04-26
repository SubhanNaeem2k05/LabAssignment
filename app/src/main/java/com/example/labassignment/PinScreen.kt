package com.example.labassignment

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.labassignment.databinding.ActivityPinScreenBinding
import com.example.labassignment.databinding.ActivityReviewScreenBinding

class PinScreen : AppCompatActivity() {
    private lateinit var binding: ActivityPinScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPinScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title= "Enter Your PIN "
        supportActionBar?.elevation = 0F

        binding.buget.setOnClickListener {
            Toast.makeText(this, "Enter PIN", Toast.LENGTH_LONG).show()

            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // handle arrow click here
        if (item.itemId == android.R.id.home) {
            finish() // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item)
    }
}