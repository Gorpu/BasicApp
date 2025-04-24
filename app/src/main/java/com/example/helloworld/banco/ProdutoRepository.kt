package com.example.helloworld.banco

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProdutoRepository(private val produtoDao: ProdutoDao){
    //Buscar todos os produtos definidos em Produto.kt
    suspend fun pegarProdutos(): List<Produto> {
        return produtoDao.getAll()//Retorno
    }
    // Inserir produto
    suspend fun inserirProduto(produto: Produto)  {
        produtoDao.insert(produto)
    }

    // Atualizar produto
    suspend fun atualizarProduto(produto: Produto) {
        produtoDao.update(produto)
    }

    // Deletar produto
    suspend fun deletarProduto(produto: Produto) {
        produtoDao.delete(produto)
    }

}