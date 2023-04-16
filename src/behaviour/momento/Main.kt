
fun main() {
    with(Adder()) {
        add(10)
        println(result)
        save()
        add(20)
        println(result)
        undo()
        println(result)
    }
}

