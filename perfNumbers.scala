// Write a program to calculate sum of all perfect numbers between 1 and 100. Display perfect numbers also.
object perf {
  def main(args: Array[String]) {
    var sum = 0;
    var psum = 0;
    var perfect = " ";
    for (i <- 1 to 100) {
      for (j <- 1 to i - 1) {
        if (i % j == 0) {
          sum = sum + j;
        }
      }
      if (sum == i) {
        psum = psum + i; // sum of perfect number;
        perfect = perfect + " " + i;
      }
      sum = 0;
    }
    println("perfectNumbers:" + perfect);
    println("Sum of Perfect Number:" + psum);
  }
}
