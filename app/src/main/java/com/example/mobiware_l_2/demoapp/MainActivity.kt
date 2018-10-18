package com.example.mobiware_l_2.demoapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnClick(view: View) {
        val toastMessage = Toast.makeText(this, "text", Toast.LENGTH_LONG)
        toastMessage.show()
    }

    fun countMe(view: View) {
        //val showCountTextView= findViewById<TextView>(R.id.txtCount);
        val showCountTextView = findViewById<TextView>(R.id.txtCount)
        val countString = showCountTextView.text.toString()
        Log.i("Check", countString)

        var count: Int = Integer.parseInt(countString)
        count++

        showCountTextView.text = count.toString()

    }


    fun ramdomClick(view: View) {
        // open second Acticity

        // Get the current value of the text view.
        val countString = txtCount.text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)
        val mIntent = Intent(this, AsyncActivity::class.java)
        // Add the count to the extras for the Intent.
        //   mIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(mIntent)

    }


}
