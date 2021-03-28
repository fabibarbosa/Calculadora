package com.fabibarbosa.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.Placeholder

class MainActivity : AppCompatActivity() {
    lateinit var curreExpressionPlaceholder: EditText
    lateinit var resultExpressionPlaceholder: EditText
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        curreExpressionPlaceholder = findViewById<EditText>(R.id.currentMathExpression)
        resultExpressionPlaceholder = findViewById<EditText>(R.id.currentResult)

    }

    fun operationFunction(btn: View) {
        val btn = btn as Button
        val btnText = btn.getText().toString()
        if (btnText == "=") {
            val currentExpressionValue = curreExpressionPlaceholder.text.toString()
            val currentValue : Int = currentExpressionValue.toInt()
            println(currentValue)
            resultExpressionPlaceholder.setText("10")
        }else {
            val currentValue = curreExpressionPlaceholder.text.toString() + btnText
            curreExpressionPlaceholder.setText(currentValue)
        }
    }
}