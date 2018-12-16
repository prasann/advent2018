class D02P1 {
  fun stringToMap(strToBeCoverted: String): Map<Char, Int> {
    return strToBeCoverted.groupingBy { it }.eachCount()
  }

  fun hasTwoChars(charMap: Map<Char, Int>): Boolean {
    return charMap.values.contains(2)
  }

  fun hasThreeChars(charMap: Map<Char, Int>): Boolean {
    return charMap.values.contains(3)
  }

  fun checksum(input: List<String>): Int {
    var twoCharCounter = 0
    var threeCharCounter = 0
    input.forEach {
      val charMap = stringToMap(it)
      if (hasTwoChars(charMap)) {
        twoCharCounter++
      }
      if (hasThreeChars(charMap)) {
        threeCharCounter++
      }
    }
    return twoCharCounter * threeCharCounter
  }
}