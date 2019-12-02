package com.medialink.deco2myintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup

class MoveForResultActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnChoose: Button
    private lateinit var rdgNumber: RadioGroup
    companion object {
        const val EXTRA_SELECTED_VALUE = "extra_selected_value"
        const val RESULT_CODE = 110
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_for_result)

        setupViews()
    }

    private fun setupViews() {
        btnChoose = findViewById(R.id.btn_choose)
        rdgNumber = findViewById(R.id.rdg_number)

        btnChoose.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_choose) {
            if (rdgNumber.checkedRadioButtonId != 0) {
                var value = 0
                when (rdgNumber.checkedRadioButtonId) {
                    R.id.rad_50 -> value = 50
                    R.id.rad_100 -> value = 100
                    R.id.rad_150 -> value = 150
                    R.id.rad_200 -> value = 200
                }

                val resultIntent = Intent()
                resultIntent.putExtra(EXTRA_SELECTED_VALUE, value)
                setResult(RESULT_CODE, resultIntent)
                finish()
            }
        }
    }
}
