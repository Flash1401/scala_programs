// Write a program to create a list of 1 to 100 numbers. Create second list from first list selecting numbers which are perfect square. Display it.
import scala.collection.mutable.ListBuffer
object list {
  def main(args: Array[String]) {
    val l1 = List.range(1, 101);
    var l2: ListBuffer[Int] = ListBuffer();
    for (i <- l1) {
      for (j <- 1 to i) {
        if (i == j * j)
          l2 += i;
      }
    }
    println("Perfect Numbers:" + l2);
  }
}
