package com.burakdemir.coffeeshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var counter=0 //holds number for coffee index
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeImage(counter)
    }

    fun forward(view: View) {
        counter++;
        counter%=5;
        changeImage(counter)
    }
    fun backward(view: View){
        counter--;
        if(counter<0)
            counter+=5;
        counter%=5;
        changeImage(counter)
    }
    fun changeImage(counter:Int){
        when(counter){
            0-> {
                coffeeImages.setImageResource(R.drawable.americano)
                coffeeName.text = "Americano"
                backward.text="< Turkish Coffee"
                forward.text="Espresso >"
            }
            1-> {
                coffeeImages.setImageResource(R.drawable.espresso)
                coffeeName.text = "Espresso"
                backward.text="< Americano"
                forward.text="Filter Coffee >"
            }
            2-> {
                coffeeImages.setImageResource(R.drawable.filter)
                coffeeName.text = "Filter Coffee"
                backward.text="< Espresso"
                forward.text="Turkish Coffee >"
            }
            3-> {
                coffeeImages.setImageResource(R.drawable.turkish)
                coffeeName.text = "Turkish Coffee"
                backward.text="< Filter Coffee"
                forward.text="Double Espresso >"
            }
            4-> {
                coffeeImages.setImageResource(R.drawable.doubleespresso)
                coffeeName.text = "Double Espresso"
                backward.text="< Turkish Coffee"
                forward.text="Americano >"
            }
        }
    }
}