class IfElseTest {
    fun isValue2(value: Int?) {
        if (value == 2) {
            println("given value is 2")
        } else {
            println("the value doesn't match")
        }
    }
}

fun main() {
    val test = IfElseTest();
    test.isValue2(2);
}
