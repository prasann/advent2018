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

  private fun String.reactWithIgnore(ignore: Char?): String =
      this.fold(mutableListOf<Char>()) { done, char ->
        when {
          ignore != null && char.equals(ignore, true) -> Unit
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

  fun runPart2(input: String): Int =
      ('A'..'Z')
          .map { input.reactWithIgnore(it).length }
          .min()
          ?: throw IllegalStateException()
}