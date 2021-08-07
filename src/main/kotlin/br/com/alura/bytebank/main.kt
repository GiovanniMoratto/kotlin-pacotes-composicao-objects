package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.*
import br.com.alura.bytebank.teste.testaContasDiferentes

/**
 *@Author giovanni.moratto
 */

fun main() {

    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)

    println("nome do cliente ${fran.nome}")

    val giovanni = Cliente(nome = "Giovanni", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = giovanni, numero = 1000)
    val contaCorrente = ContaCorrente(titular = giovanni, numero = 1001)

    testaContasDiferentes()

    println("Total de contas: $totalContas")
}
