class WhenTest {
    fun isValue2(value: String?) {
        when (value) {
            "2" -> println("value is 2");
            else -> println(value);
        }
    }

}

fun main() {
    val test = WhenTest();
    test.isValue2("2");
    test.isValue2(null);
}
