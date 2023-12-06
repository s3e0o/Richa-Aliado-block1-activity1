package com.aliado.richa.block1.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.aliado.richa.block1.p1.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btClickHere.setOnClickListener {
            showPopUp()
        }
    }
    private fun showPopUp() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("ITE393 P1 Quiz")
            .setMessage("Merry Christmas!")
            .setPositiveButton("Likewise") {dialog, which ->
                Toast.makeText(this, "ho ho ho", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Okay") {dialog, which ->
                dialog?.dismiss()
            }
        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()
    }
}