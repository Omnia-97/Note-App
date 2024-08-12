package com.example.noteappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.noteappkotlin.database.NoteDataBase
import com.example.noteappkotlin.databinding.ActivityMainBinding
import com.example.noteappkotlin.repository.NoteRepository
import com.example.noteappkotlin.viewmodel.NoteViewModel
import com.example.noteappkotlin.viewmodel.NoteViewModelFactory

class MainActivity : AppCompatActivity() {
      lateinit var noteViewModel : NoteViewModel
      lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpViewModel()
    }

    private fun setUpViewModel() {
        val noteRepository = NoteRepository(NoteDataBase(this))
        val viewModelProviderFactory = NoteViewModelFactory(application , noteRepository)
        noteViewModel = ViewModelProvider(
            this,
            viewModelProviderFactory
        ).get(NoteViewModel::class.java)
    }
}