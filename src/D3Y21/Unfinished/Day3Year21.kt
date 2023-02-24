package D3Y21.Unfinished

import java.io.File
import kotlin.math.max
import kotlin.math.min

/*fun part1() {
    val input = File("src/D3Y21/inputD3Y21").readText()
    val newInput: MutableList<Char> = ArrayList()
    for (j in input) {
        newInput.add(j)
    }
    var i = 0
    var a = 0; var b = 1; var c = 2; var d = 3; var e = 4
    var first = newInput[a]
    var second = newInput[b]
    var third = newInput[c]
    var fourth = newInput[d]
    var fifth = newInput[e]
    while (i < newInput.size-1) {
        if (first == '0') {
            first -= 1
            a += 5
            i++
        }
        else {
            first += 1
            a += 5
            i++
        }
        if (second == '0') {
            second -= 1
            b += 5
            i++
        }
        else {
            second += 1
            b += 5
            i++
        }
        if (third == '0') {
            third -= 1
            c += 5
            i++
        }
        else {
            third += 1
            c += 5
            i++
        }
        if (fourth == '0') {
            fourth -= 1
            d += 5
            i++
        }
        else {
            fourth += 1
            d += 5
            i++
        }
        if (fifth == '0') {
            fifth -= 1
            e += 5
            i++
        }
        else {
            fifth += 1
            e += 5
            i++
        }
    }
    println("$first, $second, $third, $fourth, $fifth")

}*/

fun newPart1(input: List<String>): Int {
    val numLength = input.first().length
    val counts = IntArray(numLength) { 0 }
    for (number in input) {
        for (i in 0 until numLength) {
            if (number[i] == '1') counts[i]++ else counts[i]--
        }
    }
    val gammaStr = counts.map { max(min(it, 1), 0) }.joinToString("") { it.toString() }
    val gamma = gammaStr.toInt(2)
    val epsilon = gammaStr.toCharArray().map { if (it == '0') '1' else '0' }.joinToString("").toInt(2)
    return gamma * epsilon
}

fun main(){
    val input = File("src/D3Y21/inputD3Y21").readLines()
    println("${newPart1(input)}")
}
//Störd lösning
//.groupingBy { it[i] }.eachCount().entries.maxWith(compareBy({ it.value }, { it.key })).key
