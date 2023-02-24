package D4Y20

import java.io.File

fun part1(input: List<String>) {
    val content = mapOf(
        "hcl: " to "^#[0-9a-fA-F]{6}$",
        //"cid: " to "",
        "ecl: " to "(amb|blu|brn|grn|gry|hzl|oth)",
        "hgt: " to "100..200cm",
        "byr: " to "1920..2002",
        "pid: " to "^\\d{9}$",
        "eyr: " to "2020..2030",
        "iyr :" to "2010..2020")

}
fun newPart1(passports: List<Map<String, String>>) {
    passports.count { p -> p.size == 8 || p.size == 7 && "cid" !in p.keys }
}

fun main() {
    val input = File("src/D4Y20/inputD4Y20").readText()

}