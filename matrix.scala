// Write a program to calculate transpose of a matrix and check if the resultant matrix is lower triangular or not.
// import scala.io.StdIn;
object transpose_lt {
  def main(args: Array[String]) {
    var mat = Array.ofDim[Int](3, 3);
    var rmat = Array.ofDim[Int](3, 3);
    var isLower: Boolean = true;
    println("Enter Matrix");
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        mat(i)(j) = readInt(); // scala.io.StdIn.
      }
    }
    println("Matrix is:");
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(mat(i)(j) + " ");
      }
      println();
    }
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        rmat(i)(j) = mat(j)(i);
      }
    }
    println("Transepose of Matrix is:");
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(rmat(i)(j) + " ");
      }
      println();
    }
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        if (i < j) {
          if (rmat(i)(j) != 0)
            isLower = false;
        }
      }
    }
    if (isLower == true)
      println("Is Lower Triangular");
    else
      println("Is not Lower Triangular");
  }
}
