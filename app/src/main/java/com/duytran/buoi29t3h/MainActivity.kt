package com.duytran.buoi29t3h

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import java.io.IOException
import java.io.InputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.editText)

        try {
            val inputStream: InputStream = assets.open("account.txt")
            val size: Int = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()

            val text = String(buffer)
            editText.setText(text)
        }catch (e: IOException){
            e.printStackTrace()
        }
    }
}