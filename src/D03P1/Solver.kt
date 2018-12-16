package D03P1

import java.io.File

class Solver {
  private fun readFileAsList(fileName: String): List<String> = File(fileName).useLines { it.toList() }

  private fun claims(): List<Claim> {
    val list = readFileAsList("src/D03P1/input.txt")
    return list.map { Claim.stringToClaim(it) }
  }

  fun readIt(): Int {
    return claims()
        .flatMap { it.area() }
        .groupingBy { it }
        .eachCount()
        .count { it.value > 1 }
  }
}

