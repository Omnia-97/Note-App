package com.example.noteappkotlin.repository

import com.example.noteappkotlin.database.NoteDataBase
import com.example.noteappkotlin.model.Note

class NoteRepository(private val db : NoteDataBase) {
    suspend fun insertNote(note: Note)  = db.noteDAO().insertNote(note)
    suspend fun updateNote(note: Note) = db.noteDAO().updateNote(note)
    suspend fun deleteNote(note: Note) = db.noteDAO().deleteNote(note)
    fun getAllNotes() = db.noteDAO().getAllNotes()
    fun searchNote(query: String) = db.noteDAO().searchNote(query)
}