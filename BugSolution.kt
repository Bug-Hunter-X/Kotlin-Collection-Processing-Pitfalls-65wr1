fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers)

    val sum = list.reduceOrNull { acc, i -> acc + i }
    println(sum)

    //Handling empty list
    val emptyList = emptyList<Int>()
    val sumOfEmptyList = emptyList.reduceOrNull{acc,i -> acc + i}
    println(sumOfEmptyList) //Prints null

    val sumOfEmptyListWithDefaultValue = emptyList.fold(0){acc, i -> acc + i}
    println(sumOfEmptyListWithDefaultValue) //Prints 0
}