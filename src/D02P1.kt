class D02P1 {
    fun stringToMap(strToBeCoverted: String): MutableMap<Char, Int> {
        val resultMap = mutableMapOf<Char, Int>()
        strToBeCoverted.toCharArray().forEach {
            val occurence = resultMap.get(it) ?: 0
            resultMap.put(it, occurence + 1)
        }
        return resultMap
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