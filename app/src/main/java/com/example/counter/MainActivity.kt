package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.counter.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private var counterValue = 0

    private lateinit var binding: ActivityMainBinding


    //private Textview counter = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val button = findViewById<Button>(R.id.button3)
        // button.setText("NeuerText")
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    fun increment(view: View) {
       binding.counterVal++
        println("Increments!")
        Log.d("Main_Activity", "Counter value: " + binding.counterVal)
    }

    fun decrement(view: View) {
        binding.counterVal--
    }
}
