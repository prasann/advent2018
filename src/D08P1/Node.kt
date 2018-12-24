package D08P1

private class Node(children: List<Node>, metadata: List<Int>) {
  val metadataTotal: Int =
      metadata.sum() + children.sumBy { it.metadataTotal }

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
  fun solver(rawInput: String): Int {
    val tree: Node = Node.of(rawInput.split(" ").map { it.toInt() }.iterator())
    return tree.metadataTotal
  }
}