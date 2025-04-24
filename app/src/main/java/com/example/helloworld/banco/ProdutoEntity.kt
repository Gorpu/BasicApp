package com.example.helloworld.banco

import androidx.room.Entity
import androidx.room.PrimaryKey

// Esta classe representa uma tabela no banco de dados Room chamada "produto".
@Entity
data class Produto(
    @PrimaryKey(autoGenerate = true) val id: Int = 0, // chave primária gerada automaticamente
    val nome: String,
    val preco: Double
)
