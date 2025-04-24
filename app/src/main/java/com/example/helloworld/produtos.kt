package com.example.helloworld

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp


@Composable
fun Tela(
    modifier: Modifier,
    viewModel: CadastroViewModel,
    corFundo: Modifier = Modifier.background(color = Color.Red)
) {
    var produto by remember { mutableStateOf("") }
    var valor by remember { mutableStateOf("") }


    Column (
        //################### Disposição dos Elementos e Tela
        modifier = corFundo
            .fillMaxSize() //Preenche toda a tela com a coluna
            .offset(x = 60.dp, y = 206.dp) //
        ) {
        //################### Ordem dos Elementos
        TextField(
            label = { Text("Produto:") },
            value = produto,
            onValueChange = { produto = it }
        )
        Spacer(modifier = Modifier.padding(8.dp))
        TextField(
            label = { Text("Valor do Produto R$:") },
            value = valor,
            onValueChange = { valor = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }

    Row (Modifier.offset(x = 150.dp, y=350.dp)){
        Button(onClick = { println("Deu certo!!!") }) {
            Text("Salvar")
        }
        Spacer(modifier = Modifier.padding(6.dp))
            Button(onClick = {println("Voltar")}) {
                Text("Voltar")
        }
    }
}

