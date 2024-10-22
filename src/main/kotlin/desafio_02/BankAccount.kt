package org.example.desafio_02

class BankAccount(val accountHolder: String) {
    private var _balance: Double = 0.0

    val balance: Double
        get() = _balance

    fun deposit(amount: Double){
        if (amount > 0){
            _balance += amount
            println("Depositando: $amount - Saldo atual -> $_balance")
        }else{
            println("Depósito inválido.")
        }
    }

    fun withdraw(amount: Double){
        if (amount > 0 && amount <= _balance){
            _balance -= amount
            println("Saque de $amount realizado - Saldo atual -> $_balance")
        } else if (amount > _balance){
            println("Saque de $amount não realizado - Saldo insuficiente - Saldo atual -> $_balance")
        } else{
            println("Valor de saque inválido.")
        }
    }
}