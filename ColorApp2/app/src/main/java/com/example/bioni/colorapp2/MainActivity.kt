package com.example.bioni.colorapp2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import android.widget.Button
import android.widget.Toast
import java.util.Random
import kotlinx.android.synthetic.main.activity_main.*


/******************
 * Activity 1
 ****************/
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.color_button)
        val button2 = findViewById<Button>(R.id.switch_button)



        button.setOnClickListener {
            val random = Random()
            fun rand(from: Int, to: Int) : Int {
                return random.nextInt(to-from) + from
            }
            val r = rand(0,255)                                 //random red
            val g = rand(0,255)                                 //random green
            val b = rand(0,255)                                 //random blue



            val hexConvert = String.format("#%02x%02x%02x", r,g,b)

            val cCol = Toast.makeText(this, hexConvert, Toast.LENGTH_SHORT)           //Text to acknowledge button works
            //  textView2.setTextColor(Color.rgb(200,0,0))  red


            text_input.setTextColor(Color.rgb(r,g,b))                            //random color for text
            cCol.show();


        }
        button2.setOnClickListener {
            val intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)
        }
    }

}
