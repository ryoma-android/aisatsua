package com.example.aisatsuapp

import android.app.TimePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn1.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        if (v.id == R.id.btn1) {
            showTimePickerDialog()

        }
    }


    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                Log.d("UI_PARTS", "$hourOfDay:$minute")


                if (hourOfDay >= 2 && hourOfDay <= 9) {
                  tv1.setText("おはよう")
                } else if (hourOfDay >= 10 && hourOfDay <= 17) {
                  tv1.setText("こんにちは")
                }else{
                  tv1.setText("こんばんは")
                }
            },
            13, 0, true)

        timePickerDialog.show()
    }
}



