//Write a program to calculate average of all prime numbers between n1 and n2 (take n1 and n2 from user).
object prime {
  def main(args: Array[String]) {
    var n1 = 0;
    var n2 = 0;
    var count = 0;
    var pcount = 0;
    var sum = 0;
    var prime = " ";
    println("Enter two numbers:");
    n1 = scala.io.StdIn.readInt();
    n2 = scala.io.StdIn.readInt();
    for (i <- n1 to n2) {
      count = 0;
      for (j <- 1 to i) {
        if (i % j == 0) {
          count = count + 1;
        }
      }
      if (count == 2) {
        prime = prime + " " + i;
        pcount = pcount + 1;
        sum = sum + i;
      }
    }

    println("prime numbers:" + prime);
    println("average:" + sum / pcount);
  }
}
