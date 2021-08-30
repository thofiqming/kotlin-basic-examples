class ElvisOperationTest {

    fun isValue2(value: Int): Boolean {
        return value == 2 ?: "value is not 2";
    }
}

fun main() {
    val test = ElvisOperationTest();
    println(test.isValue2(2));
}
