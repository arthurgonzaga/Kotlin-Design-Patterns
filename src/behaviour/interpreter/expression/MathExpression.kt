package behaviour.interpreter.expression

interface MathExpression {

    fun interpret(context: String): Float
}