interface InterFaceTest {
    val interfaceVariable: String;
    fun printPersonData(): String;
    fun defaultImpl() {
        println("default implementation in interface");
    }
}

interface SecondInterface {
    fun secondInterfaceMethod();
}

class PersonSecondInterfaceTest : InterFaceTest, SecondInterface {
    override val interfaceVariable: String
        get() = "interface variable initialization in class";

    override fun printPersonData(): String {
        return "Person data";
    }

    override fun secondInterfaceMethod() {
        println("second interface method impl")
    }
}

fun main() {
    val test = PersonSecondInterfaceTest();
    val result = test.printPersonData();
    println(test.interfaceVariable);
    println(result);
    test.defaultImpl();
    test.secondInterfaceMethod();
}
