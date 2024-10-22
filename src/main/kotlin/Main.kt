package org.example

import org.example.desafio_01.Animal
import org.example.desafio_01.Cat
import org.example.desafio_01.Dog


//Funcão para Desafio 01
fun animalSounds(animals: List<Animal>) {
    for (animal in animals) {
        print("${animal.name} - ")
        animal.makeSound()
    }
}

fun main() {
    println("DESAFIO 01")
    val animals = listOf(Dog("Titan"), Cat("Fumaça"), Dog("Pretinho"), Dog("Sherlock"))
    animalSounds(animals)
}