package D1Y21.inl

import java.io.File

fun main() {

    //My first
    fun depthCounter(input: List<String>) : Int {
        var counter = 0
        var depth = 0
        for (i in input) {
            val newDepth = i.toInt()
            if (depth == 0) {
                depth = newDepth
            }
            if (depth < newDepth){
                counter++
            }
            depth = newDepth
        }
        return counter
    }

    //My second
    fun depthCounter2(input: List<String>): Int {
        var mutableInput = mutableListOf<String>()
        var counter = 0
        for (i in input.indices) {
            val one = input.getOrNull(i + 1)
            val two = input.getOrNull(i + 2)
            if (one == null  || two == null || one.isEmpty() || two.isEmpty()) {
                continue
            }
            val sum = (input[i].toInt() + one.toInt() + two.toInt()).toString()
            if (mutableInput.isEmpty()) {
                mutableInput = mutableListOf(sum)
            } else {
                mutableInput.add(counter, sum)
            }
            counter++
        }
        return depthCounter(mutableInput);
    }

    val input = File("src/D1Y21/inputD1Y21").readLines()
    println("${depthCounter(input)}")
    println("${depthCounter2(input)}")
    println("------------------------")

    //Fixed first
    val input2 = input.map { it.toInt() }
    fun newDepthCounter(): Int{
        return (0 until input2.lastIndex).count() {input2[it] < input2[it + 1]}
    }
    println("${newDepthCounter()}")

    //Fixed second
    fun newDepthCounter2() : Int {
        val input3 = input2.windowed(3) {it.sum()}
        return (0 until input3.lastIndex).count() {input3[it] < input3[it + 1]}
    }
    println("${newDepthCounter2()}")

}