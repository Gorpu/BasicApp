package com.example.helloworld

import androidx.lifecycle.ViewModel
import com.example.helloworld.banco.ProdutoRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CadastroViewModel(repository: ProdutoRepository) : ViewModel() {

    private val _produto = MutableStateFlow("")
    val produto: StateFlow<String> = _produto

    private val _valor = MutableStateFlow("")
    val valor: StateFlow<String> = _valor

    fun atualizarProduto(novo: String) {
        _produto.value = novo
    }

    fun atualizarValor(novo: String) {
        _valor.value = novo
    }

    fun salvar() {
        println("Produto: ${_produto.value}, Valor: ${_valor.value}")
        // Aqui você colocaria a lógica para salvar no banco (Room)
    }
}
