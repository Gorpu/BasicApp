package com.example.helloworld.banco

import androidx.room.*

@Dao // Essa anotação diz que essa interface define métodos para interagir com o banco
interface ProdutoDao {

    @Query("SELECT * FROM produto")
    suspend fun getAll(): List<Produto> // Retorna todos os produtos do banco

    @Insert
    suspend fun insert(produto: Produto) // Insere um novo produto

    @Update
    suspend fun update(produto: Produto) // Atualiza um produto existente

    @Delete
    suspend fun delete(produto: Produto) // Deleta um produto
}
