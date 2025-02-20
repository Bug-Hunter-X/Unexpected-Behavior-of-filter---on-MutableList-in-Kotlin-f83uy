fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.retainAll { it % 2 == 0 }
    println(mutableList.joinToString()) // This will print "2, 4", correctly modifying the list in place.

    //Alternative using filter and toMutableList for functional approach
    val filteredList = mutableList.filter { it %2 == 0 }.toMutableList()
    println(filteredList.joinToString()) //prints "2, 4"
    
}