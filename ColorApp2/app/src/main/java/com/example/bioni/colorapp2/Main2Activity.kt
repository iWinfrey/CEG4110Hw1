package com.example.bioni.colorapp2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.graphics.Color
import android.widget.Toast
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main2.*
import tech.picnic.fingerpaintview.FingerPaintImageView


/**************
 * Activity 2
 *
 *************/
class Main2Activity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener, View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val red = findViewById<SeekBar>(R.id.seekBar1)
        val blue = findViewById<SeekBar>(R.id.seekBar2)
        val green = findViewById<SeekBar>(R.id.seekBar3)
        val clear = findViewById<Button>(R.id.clear_button)
        clear.setOnClickListener(this)
        red.setOnSeekBarChangeListener(this)
        green.setOnSeekBarChangeListener(this)
        blue.setOnSeekBarChangeListener(this)

        val switchBack = findViewById<View>(R.id.switch_backButton)
        switchBack.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }


        override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            val red = findViewById<SeekBar>(R.id.seekBar1)
            val blue = findViewById<SeekBar>(R.id.seekBar2)
            val green = findViewById<SeekBar>(R.id.seekBar3)

            if (seekBar?.id == red.id || seekBar?.id == green.id || seekBar?.id == blue.id) {
                val r = red.progress
                val g = green.progress
                val b = blue.progress
                val color = Color.argb(255, r, g, b)


                val finger = findViewById<FingerPaintImageView>(R.id.finger)
                finger.strokeColor = color
                val colorPreview = findViewById<View>(R.id.imageView)
                colorPreview.setBackgroundColor(color)
            }
        }
    override fun onClick(v: View?) {
    when (v?.id)
    {
            R.id.clear_button -> {
                Toast("agsasgffghgrdfsdgtrfslf")
            }
        else -> {

    }

    }


    }

    private fun Toast(s: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
    }


}
