package creational

data class PC(
        val cpu: String = "Intel X",
        val motherboard: String = "Asus Y",
        val ram: Int = 8,
        val graphicsCard: String? = null,
)


fun main() {
    val generalPC = PC()

    val pcGamer = generalPC.copy(
            ram = 16,
            graphicsCard = "Nvidia Z"
    )

    println(generalPC)
    println(pcGamer)
}