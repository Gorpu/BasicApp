package com.example.helloworld.banco

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "produto")
data class Produto(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nome: String
)
