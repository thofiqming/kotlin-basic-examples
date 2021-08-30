class ConstructorTest(val firstVariable: String, val secondVariable: String) {

    //secondary constructor
    constructor(firstVariable: String) : this(firstVariable, "second value from secondary constructor")
}

fun main() {
    val test = ConstructorTest("10", "20");
    println(test.firstVariable + "," + test.secondVariable);

    val test1 = ConstructorTest("first value");
    println(test1.firstVariable + ", " + test1.secondVariable);
}
