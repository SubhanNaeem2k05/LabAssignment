package com.example.labassignment

import android.content.Intent
import android.os.Bundle
import android.text.Layout.Alignment
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.labassignment.databinding.ActivityCheckoutScreenBinding

class CheckoutScreen : AppCompatActivity() {
    private lateinit var binding: ActivityCheckoutScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCheckoutScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title= "Checkout"
        supportActionBar?.elevation = 0F


        binding.buget.setOnClickListener {
            Toast.makeText(this, "Total Amount oof Car", Toast.LENGTH_LONG).show()

            val i = Intent(this, Shipping::class.java)
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