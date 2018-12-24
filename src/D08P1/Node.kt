package D08P1

private class Node(children: List<Node>, metadata: List<Int>) {
  val metadataTotal: Int =
      metadata.sum() + children.sumBy { it.metadataTotal }

  val weight: Int =
      if (children.isEmpty()) metadata.sum()
      else metadata.sumBy { children.getOrNull(it - 1)?.weight ?: 0 }

  companion object {
    fun of(values: Iterator<Int>): Node {
      val numChildren: Int = values.next()
      val numMetadata: Int = values.next()
      val children = (0 until numChildren).map { Node.of(values) }
      val metadata = (0 until numMetadata).map { values.next() }.toList()
      return Node(children, metadata)
    }
  }
}


class Day08() {
  fun part1(rawInput: String): Int {
    val tree: Node = Node.of(rawInput.split(" ").map { it.toInt() }.iterator())
    return tree.metadataTotal
  }

  fun part2(rawInput: String): Int {
    val tree: Node = Node.of(rawInput.split(" ").map { it.toInt() }.iterator())
    return tree.weight
  }
}