package com.example.toastmessage

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val uploadBtn = findViewById<Button>(R.id.UploadButton)
        val downloadBtn= findViewById<Button>(R.id.DownloadButton)

        //to show toast message for uploadBtn
        uploadBtn.setOnClickListener {
            Toast.makeText(this, "Showing Upload Button Toast msg..",Toast.LENGTH_LONG).show()
        }
        //to show toast message for downloadBtn
        downloadBtn.setOnClickListener {
            Toast.makeText(this, "Showing Download Button Toast msg..",Toast.LENGTH_LONG).show()
        }
}
}