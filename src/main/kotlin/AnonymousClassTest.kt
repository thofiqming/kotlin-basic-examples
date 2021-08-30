interface AnonymousInterface {
    fun test();
}

fun main() {
    val anonymous = object : AnonymousInterface {
        override fun test() {
            println("test method call")
        }
    }
    anonymous.test();
}
