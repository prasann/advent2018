class D02P2 {
    fun stringToList(stringToBeConverted: String): List<Char> {
        return stringToBeConverted.toList()
    }

    fun hasOneDiff(list1: List<Char>, list2: List<Char>): Boolean {
        val booleanList = list1.zip(list2).map { it.first == it.second }
        val trueFalseCount = booleanList.groupingBy { it }.eachCount()
        return trueFalseCount.get(false) == 1
    }

    fun findThePair(input: List<String>): Pair<List<Char>, List<Char>>? {
        val listOfLists = input.map { stringToList(it) }
        listOfLists.forEach { list1 ->
            listOfLists.forEach { list2 ->
                if (hasOneDiff(list1, list2)) {
                    return Pair(list1, list2)
                }
            }
        }
        return null
    }

    fun findCommonChars(mostCommonLists: Pair<List<Char>, List<Char>>): String {
        mostCommonLists.let { it ->
            val resultList = it.first.zip(it.second).map {
                if (it.first == it.second) it.first else null
            }.filterNotNull()

            return resultList.joinToString("")
        }
    }

    fun findTheCommmon(input: List<String>): String {
        val mostCommonLists = findThePair(input)
        mostCommonLists?.let {
            return findCommonChars(it)
        }
        return null.toString()
    }
}