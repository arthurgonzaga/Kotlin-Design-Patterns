package behaviour.state

fun main() {
    with(Fan()){
        turnUp()
        turnUp()
        turnUp()
        turnDown()
        turnDown()
        turnDown()
    }
}