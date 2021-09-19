package creational

import java.lang.IllegalArgumentException

interface Animal

class Cat: Animal{
    override fun toString(): String {
        return "I'm a Cat"
    }
}

class Dog: Animal{
    override fun toString(): String {
        return "I'm a dog"
    }
}

abstract class AnimalFactory {

    abstract fun makeAnimal(): Animal

    companion object {
        inline fun <reified T: Animal> createFactory(): AnimalFactory{
            return when(T::class){
                Cat::class -> CatFactory()
                Dog::class -> DogFactory()
                else -> throw IllegalArgumentException()
            }
        }
    }
}

class CatFactory: AnimalFactory() {
    override fun makeAnimal(): Animal = Cat()
}

class DogFactory: AnimalFactory() {
    override fun makeAnimal(): Animal = Dog()
}

fun main() {
    val dogFactory = AnimalFactory.createFactory<Dog>()
    val dog = dogFactory.makeAnimal()
    println(dog)
}