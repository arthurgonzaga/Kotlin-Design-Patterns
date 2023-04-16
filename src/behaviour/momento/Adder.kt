class Adder {
    var result = 0
        private set

    private val memento = Memento(result)

    fun add(newNumber: Int) {
        result += newNumber
    }

    fun save() {
        memento.state = result
    }

    fun undo() {
        result = memento.state
    }
}
