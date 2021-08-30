open class AccessModifierTest {
    protected open lateinit var value: String;
}

class AccessModifierChild : AccessModifierTest() {

    override var value:String = "Child value";

    fun printValues() {
        super.value = "Parent value";
        println(super.value);
        println(this.value);
    }

}

fun main() {
    val test = AccessModifierChild();
    test.printValues();
}
