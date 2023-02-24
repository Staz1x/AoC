package D2Y21.inl

import java.io.File

//My first (fixed)
fun part1(input: List<String>) {
    var i = 0
    var horizontal = 0
    var vertical = 0
    while (i < input.size -1) {
        val a = input[i]
        val b = input[i + 1].toInt()
        i += 2
        when(a) {
            "forward" -> horizontal += b
            "down" -> vertical += b
            "up" -> vertical -= b
        }
    }
    println("$horizontal, $vertical")
    println(horizontal*vertical)
}

//My second (fixed)
fun part2(input: List<String>) {

    var i = 0
    var horizontal = 0
    var tempVertical = 0
    var vertical = 0
    while (i < input.size -1) {
        val a = input[i]
        val b = input[i + 1].toInt()
        i += 2
        when(a) {
            "forward" -> {
                horizontal += b
                vertical += (tempVertical * b)
            }
            "down" -> tempVertical += b
            "up" -> tempVertical -= b
        }

    }
    println("$horizontal, $vertical")
    println(horizontal*vertical)
}

fun main() {

    val input = File("src/D2Y21/inl/inputD2Y21").readText().split(" ", "," , "\n")
    part1(input)
    part2(input)


}