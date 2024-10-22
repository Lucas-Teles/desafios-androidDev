package org.example.desafio_01

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("Woof!")
    }
}