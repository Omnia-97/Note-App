package com.example.noteappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.noteappkotlin.viewmodel.NoteViewModel

class MainActivity : AppCompatActivity() {
      lateinit var noteViewModel : NoteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}