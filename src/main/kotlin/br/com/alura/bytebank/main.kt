package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.totalContas
import br.com.alura.bytebank.teste.testaContasDiferentes

/**
 *@Author giovanni.moratto
 */

fun main() {
    val giovanni = Cliente(nome = "Giovanni", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = giovanni, numero = 1000)
    val contaCorrente = ContaCorrente(titular = giovanni, numero = 1001)

    testaContasDiferentes()

    println("Total de contas: $totalContas")
}
