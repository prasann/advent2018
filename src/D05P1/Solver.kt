package D05P1

class Solver {
  private infix fun Char?.matches(other: Char): Boolean =
      when {
        this == null -> false
        this.toUpperCase() != other.toUpperCase() -> false
        else -> this != other
      }

  private fun String.react(): String =
      this.fold(mutableListOf<Char>()) { done, char ->
        when {
          done.firstOrNull() matches char -> done.removeAt(0)
          else -> done.add(0, char)
        }
        done
      }
          .reversed()
          .joinToString(separator = "")

  fun run(input: String): Int {
    return input.react().length
  }
}