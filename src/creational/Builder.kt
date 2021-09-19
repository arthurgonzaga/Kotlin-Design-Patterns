package creational

data class Email(
        var to: String,
        var title: String = "",
        var message: String = "",
        var cc: MutableList<String> = mutableListOf(),
        var attachments: List<java.io.File> = listOf()
)


class EmailBuilder(to: String) {
    private var email = Email(to)

    fun title(title: String): EmailBuilder {
        email.title = title
        return this
    }

    fun message(message: String): EmailBuilder {
        email.message = message
        return this
    }

    fun addCC(cc: String): EmailBuilder {
        email.cc.add(cc)
        return this
    }

    fun build(): Email = email
}

fun main() {
    val email: Email = EmailBuilder("arthurgonzagaxyz@gmail.com")
            .title("Hello")
            .message("Hello world!")
            .addCC("exemplo1@gmail.com")
            .addCC("exemplo2@gmail.com")
            .addCC("exemplo3@gmail.com")
            .build()

    println(email)
}