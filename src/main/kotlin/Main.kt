package org.example

import org.example.desafio_01.Animal
import org.example.desafio_01.Cat
import org.example.desafio_01.Dog
import org.example.desafio_02.BankAccount


//Funcão para Desafio 01
fun animalSounds(animals: List<Animal>) {
    for (animal in animals) {
        print("${animal.name} - ")
        animal.makeSound()
    }
}

fun main() {
    println("----- DESAFIO 01 -----")
    val animals = listOf(Dog("Titan"), Cat("Fumaça"), Dog("Pretinho"), Dog("Sherlock"))
    animalSounds(animals)
    println()
    println("-+-+-+-+-+-+-+-+-+-+-+-+-")
    println()
    println("----- DESAFIO 02 -----")
    val account = BankAccount("Lucas")
    println("Titular da conta: ${account.accountHolder}")
    account.deposit(500.0)
    account.withdraw(600.0)
    account.withdraw(200.0)
    account.deposit(700.0)
    println("Saldo final: ${account.balance}")
}