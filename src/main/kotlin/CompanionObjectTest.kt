class CompanionObjectTest private constructor() {

    fun test() {
        println("Calling test method");
    }

    companion object Factory {
        const val id: String = "id";
        fun create() = CompanionObjectTest();
    }
}

fun main() {
    val obj = CompanionObjectTest.create();
    obj.test();
    println(CompanionObjectTest.id);
}
