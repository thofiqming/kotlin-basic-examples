
//sealed with data classes 
sealed class SealedClassTest {
    data class Person(val name: String, val age: Int) : Entity() {
        override fun toString(): String {
            return this.name + " " + this.age;
        }
    }

    object Student {
        fun create(): Entity {
            return Entity();
        }
    }
}
//Entity super class
open class Entity

class Test : SealedClassTest() {
    override fun equals(other: Any?): Boolean {
        return this === other
    }

    override fun hashCode(): Int {
        return System.identityHashCode(this)
    }

}

//extension variable
val Entity.info: String
    get() = "hello"

//extension function
fun Entity.getInfo() {
    println("getInfo extension function ");
}

fun main() {
    val person = SealedClassTest.Person("test", 35);
    println(person);
    println(person.info)
    person.getInfo();
}
