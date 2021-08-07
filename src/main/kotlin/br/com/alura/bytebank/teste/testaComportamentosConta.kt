package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

/**
 *@Author giovanni.moratto
 */

fun testaComportamentosConta() {

    val contaGiovanni = ContaCorrente(titular = "Giovanni", numero = 1000)
    contaGiovanni.deposita(200.0)

    val conta2 = ContaPoupanca(numero = 1001, titular = "2")
    conta2.deposita(300.0)

    println(conta2.titular)
    println(conta2.numero)
    println(conta2.saldo)

    println(contaGiovanni.titular)
    println(contaGiovanni.numero)
    println(contaGiovanni.saldo)

    println("depositando na conta do Giovanni")
    contaGiovanni.deposita(50.0)
    println(contaGiovanni.saldo)

    println("depositando na conta 2")
    conta2.deposita(70.0)
    println(conta2.saldo)

    println("sacando na conta do Giovanni")
    contaGiovanni.saca(250.0)
    println(contaGiovanni.saldo)

    println("sacando na conta 2")
    conta2.saca(100.0)
    println(conta2.saldo)

    println("saque em excesso na conta do Giovanni")
    contaGiovanni.saca(100.0)
    println(contaGiovanni.saldo)

    println("saque em excesso na conta 2")
    conta2.saca(500.0)
    println(conta2.saldo)

    println("Transferência da conta 2 para o Giovanni")

    if (conta2.transfere(destino = contaGiovanni, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaGiovanni.saldo)
    println(conta2.saldo)

}