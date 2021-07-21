package creational

import creational.Obligations.HOMEWORK
import creational.Obligations.TEST

/**
 *  Super class of all obligations
 *
 *  @see Homework
 *  @see Test
 */
abstract class Obligation {
    abstract val type: Int
    var title: String = ""
    var date: String = ""

    fun getType(): String{
        return this.javaClass.simpleName
    }
}

/** Obligation types **/
object Obligations{
    const val HOMEWORK = 0
    const val TEST = 1
}

/** Homework obligation **/
class Homework(override val type: Int = HOMEWORK) : Obligation()

/** Test obligation **/
class Test(override val type: Int = TEST) : Obligation()

/** Class responsible for creating the homework **/
class HomeworkFactory{

    fun createHomework(title: String, date: String): Homework{
        return Homework().apply {
            this.title = title
            this.date = date
        }
    }
}

/** Class responsible for creating the test **/
class TestFactory{

    fun createTest(title: String, date: String): Test {
        return Test().apply {
            this.title = title
            this.date = date
        }
    }
}

/** Class responsible for creating a obligation **/
object ObligationFactory {

    private val homeworkFactory = HomeworkFactory()
    private val testFactory = TestFactory()

    fun createObligation(type: Int, title: String, date: String): Obligation{
        return when(type){
            HOMEWORK -> homeworkFactory.createHomework(title, date)
            TEST -> testFactory.createTest(title, date)
            else -> error("Not found the type of: $type")
        }
    }
}


fun main() {

    val obligation = ObligationFactory.createObligation(
        type= HOMEWORK,
        title= "Do page 48 of the math book",
        date= "12/07/2021"
    )

    println(
        "type: ${obligation.getType()}\n" +
        "title: ${obligation.title}\n"+
        "date: ${obligation.date}"
    )
}