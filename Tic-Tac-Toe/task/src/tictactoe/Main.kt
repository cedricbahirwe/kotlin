package tictactoe

// Made with ❤ Cédric Bahirwe
fun main() {
    // write your code here
    print("Enter cells: ")
    val cells = readLine()!!
    val cellsArray = cells.toCharArray()
    println("-".repeat(cells.count()))

    for ((index, element) in cellsArray.withIndex()) {

        if ((index+1)%3 == 0) {
            println("$element |")
        } else {
            if ((index)%3 == 0) {
                print("| ")
            }
            print("$element ")
        }

    }

    // Or
    for (i in 0..8 step 3) {
        println("| ${cells[i]} ${cells[i + 1]} ${cells[i + 2]} |")
    }
    println("-".repeat(cells.count()))

}