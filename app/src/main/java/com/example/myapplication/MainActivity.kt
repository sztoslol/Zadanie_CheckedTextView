package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var MasłoCheckedTextView = findViewById<CheckedTextView>(R.id.MasłoCheckedTextView)
        MasłoCheckedTextView.setOnClickListener {
            if(MasłoCheckedTextView.isChecked)
            {
                MasłoCheckedTextView. isChecked = false
            }
            else
            {
                MasłoCheckedTextView. isChecked = true
            }
        }

        var CukierCheckedTextView = findViewById<CheckedTextView>(R.id.CukierCheckedTextView)
        CukierCheckedTextView.setOnClickListener {
            if(CukierCheckedTextView.isChecked)
            {
                CukierCheckedTextView. isChecked = false
            }
            else
            {
                CukierCheckedTextView. isChecked = true
            }
        }

        var ChlebCheckedTextView = findViewById<CheckedTextView>(R.id.ChlebCheckedTextView)
        ChlebCheckedTextView.setOnClickListener {
            if(ChlebCheckedTextView.isChecked)
            {
                ChlebCheckedTextView. isChecked = false
            }
            else
            {
                ChlebCheckedTextView. isChecked = true
            }
        }

        var MlekoCheckedTextView = findViewById<CheckedTextView>(R.id.MlekoCheckedTextView)
        MlekoCheckedTextView.setOnClickListener {
            if(MlekoCheckedTextView.isChecked)
            {
                MlekoCheckedTextView. isChecked = false
            }
            else
            {
                MlekoCheckedTextView. isChecked = true
            }
        }

        var HerbataCheckedTextView = findViewById<CheckedTextView>(R.id.HerbataCheckedTextView)
        HerbataCheckedTextView.setOnClickListener {
            if(HerbataCheckedTextView.isChecked)
            {
                HerbataCheckedTextView. isChecked = false
            }
            else
            {
                HerbataCheckedTextView. isChecked = true
            }
        }
    }
}