package behaviour.interpreter.expression

class MinusOperation : MathExpression {

    override fun interpret(context: String): Float {
        val minus = context.replace(" ", "").split("-")
        var result: Float


        try {
            result = minus[0].toFloat()
        } catch (_: Exception) {
            result = minus[0].last().toString().toFloat()
        }

            minus.subList(1, minus.size).forEach {
                try {
                    result -= it.toFloat()
                } catch (_: Exception) { }
            }

        return result
    }
}