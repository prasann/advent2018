package D04P1

class Solver {

  fun sleepData(input: List<String>): MutableMap<Int, List<Int>> {
    val totalSleepData = mutableMapOf<Int, List<Int>>()
    var guard = 0
    var sleepStart = 0

    input.sorted().forEach { row ->
      when {
        row.contains("Guard") -> guard = guardId(row)
        row.contains("asleep") -> sleepStart = getMinute(row)
        else -> {
          val sleepMins = (sleepStart until getMinute(row)).toList()
          totalSleepData.merge(guard, sleepMins) { a, b -> a + b }
        }
      }
    }
    return totalSleepData;
  }

  fun getFirstMatch(pattern: Regex, input: String): String {
    return pattern.find(input)!!.destructured.component1()
  }

  fun guardId(input: String): Int {
    val guardPattern = """^.+ Guard #(\d+) begins shift""".toRegex()
    return getFirstMatch(guardPattern, input).toInt()
  }

  fun getMinute(input: String): Int {
    val timePattern = """^\[.+:(\d\d)] .+$""".toRegex()
    return getFirstMatch(timePattern, input).toInt()
  }

  fun solver(input: List<String>): Int {
    val sleepData = sleepData(input)
    return sleepData
        .maxBy { it.value.size }!!
        .run { key * mostSleepiest(value)!! }
  }

  private fun mostSleepiest(value: List<Int>): Int? {
    return value.groupBy { it }.maxBy { it.value.size }?.key
  }


}