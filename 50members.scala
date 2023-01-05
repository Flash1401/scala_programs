object fneq {
  def main(args: Array[String]) {
    val l = List.tabulate(50)(n => (2 * n) + 3)
    println(l)

    val s = List.tabulate(50)(n => (2 * n) + 3).filterNot(i => i % 5 == 0)
    println("Excludes of multiple 7:-" + s)
  }
} // Create a list of 50 members using function 2n+3. Create second list excluding all elements multiple of 5.
