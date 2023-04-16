package behaviour.interpreter

import behaviour.interpreter.expression.MathExpression
import behaviour.interpreter.expression.PlusOperation

class Calculator {

    private val expression: MathExpression = PlusOperation()

    fun calculate(string: String) = println(expression.interpret(string))

}