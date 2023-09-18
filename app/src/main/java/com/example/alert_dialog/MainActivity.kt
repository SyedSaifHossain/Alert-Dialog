package com.example.alert_dialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alert_dialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alert.setOnClickListener{
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Delete Files")
            dialog.setMessage("Do you want to delete files")
            dialog.setIcon(R.drawable.delete)

            dialog.setPositiveButton("YES"){
                dialogInterface, which->
                Toast.makeText(this, "Click Yes",Toast.LENGTH_SHORT).show()
            }
            dialog.setNegativeButton("NO"){
                    dialogInterface, which->
                Toast.makeText(this, "Click No",Toast.LENGTH_SHORT).show()
            }

            dialog.setNeutralButton("CANCLE"){
                    dialogInterface, which->
                Toast.makeText(this, "Click Cancle",Toast.LENGTH_SHORT).show()
            }
            val alertDialog : AlertDialog = dialog.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}