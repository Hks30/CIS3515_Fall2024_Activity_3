package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        val numberArray = Array(50) { i -> (i + 1) * 2 }

        with(spinner) {
            adapter = TextSizeAdapter(this@MainActivity, numberArray)

            onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    parent?.run {
                        displayTextView.textSize = getItemAtPosition(position).toString().toFloat()
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {

                }
            }
        }
    }
}