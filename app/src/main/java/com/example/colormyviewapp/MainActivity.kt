package com.example.colormyviewapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners(){
        val clickableView: List<View> = listOf(box_one_txt, box_two_txt, box_three_txt, box_four_txt, box_five_txt, constraint_layout,
                                                red_btn, yellow_btn, green_btn )

        for (item in clickableView){
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View){
        when(view.id){
            //Boxes using Color Class Colors background
            R.id.box_one_txt -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_txt -> view.setBackgroundColor(Color.GRAY)

            //Boxes using Android Resources for background
            R.id.box_three_txt -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_txt -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_txt -> view.setBackgroundResource(android.R.color.holo_green_light)

            //Color boxes by hitting buttons
            R.id.red_btn -> box_three_txt.setBackgroundResource(R.color.my_red)
            R.id.yellow_btn -> box_four_txt.setBackgroundResource(R.color.my_yellow)
            R.id.green_btn -> box_five_txt.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
