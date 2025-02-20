fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.joinToString()) // This will print "2, 4", which is correct

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.filter { it % 2 == 0 } // This filters the list, but doesn't change it in place
    println(mutableList.joinToString()) // This will print "1, 2, 3, 4, 5", which might be unexpected
}