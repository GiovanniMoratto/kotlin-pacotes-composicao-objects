package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

/**
 *@Author giovanni.moratto
 */

fun testaComportamentosConta() {

    val giovanni = Cliente(nome = "Giovanni", cpf = "", senha = 1)
    val contaGiovanni = ContaCorrente(titular = giovanni, numero = 1000)
    contaGiovanni.deposita(200.0)

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)
    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaGiovanni.titular)
    println(contaGiovanni.numero)
    println(contaGiovanni.saldo)

    println("depositando na conta do Giovanni")
    contaGiovanni.deposita(50.0)
    println(contaGiovanni.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Giovanni")
    contaGiovanni.saca(250.0)
    println(contaGiovanni.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Giovanni")
    contaGiovanni.saca(100.0)
    println(contaGiovanni.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Giovanni")

    if (contaFran.transfere(destino = contaGiovanni, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaGiovanni.saldo)
    println(contaFran.saldo)

}