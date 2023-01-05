// Write a program to merge two sets of integers and calculate sum of all integers in the merged set. Also display largest and smallest element from merged set.import scala.collection.mutable.Set
object setmerge {
  def main(args: Array[String]) {
    var s1 = Set(1, 2, 3, 4, 5, 6);
    var s2 = Set(4, 5, 6, 7, 8);
    s1 ++= s2;
    println(s1);
    println("Sum:" + s1.sum);
    println("Maximum:" + s1.max);
    println("Minimum:" + s1.min);
  }
}
