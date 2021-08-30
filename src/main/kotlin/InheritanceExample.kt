open class Animal {
    open fun process() {
        println("Animal base class process method");
    }
}

internal class Tiger : Animal() {
    override fun process() {
        println("process tiger method which is overridden")
    }
}

internal object TestInheritance {
    @JvmStatic
    fun main(args: Array<String>) {
        val animal = Animal()
        animal.process()
        val tiger: Animal = Tiger()
        tiger.process()
    }
}
