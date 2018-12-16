package D03P2

data class Claim(val id: Int, val leftEdge: Int, val topEdge: Int, val width: Int, val height: Int) {
  fun area(): List<Pair<Int, Int>> {
    return (leftEdge until (width + leftEdge)).flatMap { w ->
      (topEdge until (height + topEdge)).map { h ->
        Pair(w, h)
      }
    }
  }

  companion object {
    fun stringToClaim(input: String): Claim {
      val regEx = """^#(\d+) @ (\d+),(\d+): (\d+)x(\d+)$""".toRegex()
      regEx.find(input)?.let {
        val (id, leftEdge, topEdge, width, height) = it.destructured
        return Claim(id.toInt(), leftEdge.toInt(), topEdge.toInt(), width.toInt(), height.toInt())
      }!!
    }
  }
}

