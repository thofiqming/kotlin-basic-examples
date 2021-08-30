fun main() {
    val target = 5
    val list = listOf<Int>(1, 2, 3, 4)
    val res: MutableMap<Int, Int> = HashMap();
    for (i in list.indices) {
        for (j in 1 until list.size) {
            if (list[i] + list[j] == target) {
                res[i] = j
                break
            }
        }
    }
    println(res);
}
