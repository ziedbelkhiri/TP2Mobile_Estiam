package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val bookList = listOf(
            Book("Le Petit Prince", "Antoine de Saint-Exupéry"),
            Book("1984", "George Orwell"),
            Book("Harry Potter", "J.K. Rowling")
        )
        recyclerView.layoutManager = LinearLayoutManager(this) // LinearLayoutManager organise les éléments de la liste dans une disposition verticale par défaut.
        recyclerView.adapter = BookAdapter(bookList)
    }
}