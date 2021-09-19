package creational

object Counter {
    private var count = 0

    fun add(){
        count++
    }

    fun printCount(){
        println(count)
    }
}

data class A(val counter: Counter = Counter)
data class B(val counter: Counter = Counter)

fun main() {
    A().counter.printCount()
    A().counter.add()
    A().counter.printCount()

    println("================")
    B().counter.add()
    B().counter.printCount()
    B().counter.add()
    B().counter.printCount()
}