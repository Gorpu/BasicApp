package com.example.helloworld.banco

import androidx.room.Database
import androidx.room.RoomDatabase

// Classe abstrata que conecta a entidade e o DAO
@Database(entities = [Produto::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    // Método abstrato que retorna a interface do DAO para produtos
    abstract fun produtoDao(): ProdutoDao
}
