package com.cploutarchou.dinnerpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf("Chinese", "Hamburger", "Pizza Mia", "McDonald's")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtn.setOnClickListener {
            //println("You click me!")
            val random = Random
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]

        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
        }

    }
}




