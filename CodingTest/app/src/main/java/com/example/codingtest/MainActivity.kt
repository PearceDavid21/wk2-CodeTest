package com.example.codingtest

import androidx.appcompat.app.AppCompatActivity
import java.util.Scanner
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        test_button.setOnClickListener {

        val input = enter_string_text.text.toString()

                if (input==input.reversed())
                    display_answer_text.setText("is palindrome")
                else
                    display_answer_text.setText("is not a palindrome")
            }
        }

}

