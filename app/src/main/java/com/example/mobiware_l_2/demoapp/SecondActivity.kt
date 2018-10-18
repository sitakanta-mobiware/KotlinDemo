package com.example.mobiware_l_2.demoapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = intent
        showRandomNumber()
    }

    fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        // Generate the random number
        //  val random = Random()
        /* var randomInt = 0
         // Add one because the bound is exclusive
         if (count > 0) {
             // Add one because the bound is exclusive
         //    randomInt = random.nextInt(count + 1)
         }*/

        textView2.text = "10"


    }
}
