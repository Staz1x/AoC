package D1Y20

import java.io.File

//My first
fun part1(input: List<Int>) {
    var i = 0
    var j = 1
    while(i < input.size -1) {
        val a = input[i]
        val b = input[j]
        if(a+b == 2020) {
            println(a*b)
            break
        }else if (j < input.size-1) j++
        else {
            i++
            j = i+1
        }
    }
}

//My second
fun part2(input: List<Int>) {
    var i = 0
    var j = 1
    var k = 2
    while(i < input.size-1) {
        val a = input[i]
        val b = input[j]
        val c = input[k]
        if(a+b+c == 2020) {
            println(a*b*c)
            break
        }else if(k < input.size-1) {
            k++
        }else if(j < input.size-2) {
            j++
            k = j+1
        }else {
            i++
            j = i+1
            k = j+1
        }
    }
}

//New first
fun newPart1() : Int {
    var solution = 0
    val input2 = File("src/D1Y20/inputD1Y20").readLines().map { it.toInt() }
    for (a in input2) for (b in input2) if (a + b == 2020) solution = (a * b)
    return solution
}

//New second
fun newPart2() : Int {
    var solution = 0
    val input2 = File("src/D1Y20/inputD1Y20").readLines().map { it.toInt() }
    for (a in input2) for (b in input2) for (c in input2) if (a + b + c == 2020) solution = (a * b * c)
    return solution
}

fun main() {
    val input = File("src/D1Y20/inputD1Y20").readLines().map { it.toInt() }

    part1(input)
    part2(input)

    println("${newPart1()}")
    println("${newPart2()}")

}