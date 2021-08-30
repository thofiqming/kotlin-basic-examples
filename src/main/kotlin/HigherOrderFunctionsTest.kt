fun higherOderFunction(list: List<String>, predicate: (String) -> Boolean) {
    list.forEach {
        if (predicate.invoke(it)) {
            println(it);
        }
    }
}

val predicate: (String) -> Boolean = {
    it.startsWith("I")
}

fun main() {
    higherOderFunction(listOf("I", "J"), predicate);
    listOf<Int>(1, 2, 3, 4)
        .filter { e ->
            e > 2
        }
        .forEach {
            println(it)
        }
}
