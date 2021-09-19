package creational

data class MyString(val value: String)

class MyInteger(private val value: Int){

    override fun toString(): String {
        return "$value"
    }

    companion object {

        fun valueOf(string: MyString): MyInteger{
            return MyInteger(string.value.toInt())
        }
    }
}

fun main() {
    val stringNumber = MyString("1010")
    val intNumber = MyInteger.valueOf(stringNumber)
    println(intNumber)
}