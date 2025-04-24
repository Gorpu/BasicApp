package com.example.helloworld.banco

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProdutoDao {
    @Query("SELECT * FROM produto")
    fun getAll(): List<Produto>

    @Query("SELECT * FROM produto WHERE id IN (:id)")
    fun loadAllByIds(id: IntArray): List<Produto>

    @Query("SELECT * FROM produto WHERE nome LIKE :nome")
    fun findByName(nome: String): Produto

    @Insert
    fun insert(produto: Produto)

    @Delete
    fun delete(produto: Produto)

    @Update
    fun update(produto: Produto)

    //@Query("UPDATE produto SET nome = :nome, preco = :preco WHERE id = :id")
    //fun updateProduto(id: Int, nome: String, preco: Double)

}