package behaviour.interpreter.expression

class PlusOperation: MathExpression {

    private val minusOperation = MinusOperation()

    override fun interpret(context: String): Float {
        var result = 0f

        context.replace(" ","").split("+").forEach {
            try {
                result += it.toFloat()
            } catch (_:Exception) { }
        }


        return result + minusOperation.interpret(context)
    }
}