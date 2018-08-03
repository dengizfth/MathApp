package com.example.yabgu.kotlinlearning

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }





    fun hesaplaButton(view: View){

        val katsayi = katsayiText.text.toString().toFloat()
        val sabit = sabitText.text.toString().toFloat()


        sonucView.text= " Sadece 1 kök var , x1 : " + (-1)*sabit/katsayi + " ya da " +(-1)*sabit+"/"+katsayi



    }




}
