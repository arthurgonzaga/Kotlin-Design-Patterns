package behaviour.interpreter


fun main() {
    with(Calculator()) {
        calculate("1 + 2 + 3 + 5 + 8 - 9")
        calculate("20 - 5 + 10")
    }
}