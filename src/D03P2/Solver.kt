package D03P2

import java.io.File

class Solver {
  private fun readFileAsList(fileName: String): List<String> = File(fileName).useLines { it.toList() }

  private fun claims(): List<Claim> {
    val list = readFileAsList("src/D03P2/input.txt")
    return list.map { Claim.stringToClaim(it) }
  }

  fun readIt(): Int {
    val cloth = mutableMapOf<Pair<Int, Int>, Int>()
    val claims = claims()
    val uncovered = claims.map { it.id }.toMutableSet()
    claims.forEach { claim ->
      claim.area().forEach { spot ->
        val found = cloth.getOrPut(spot) { claim.id }
        if (found != claim.id) {
          uncovered.remove(found)
          uncovered.remove(claim.id)
        }
      }
    }
    return uncovered.first()
  }
}

