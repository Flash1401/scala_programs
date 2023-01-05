// Write a program for multiplication of two matrices. Also check if the resultant matrix is upper triangular or not. (Validate number of rows and columns before multiplication and give appropriate message).
object Multiplication {
  def main(args: Array[String]) {
    println("Enter no of rows and column of 1st matrix")
    var r = readInt()
    var c = readInt()
    println("Enter no of rows and column of 2nd matrix")
    var r1 = readInt()
    var c1 = readInt()
    var a = Array.ofDim[Int](r, c)
    var b = Array.ofDim[Int](r1, c1)
    var d = Array.ofDim[Int](r, c1)
    if (r1 != c) {
      println("Multiplication is not possible")
    } else {
      println("Enter first matrix") // to accept
      for (i <- 0 to (r - 1)) {
        for (j <- 0 to (c - 1)) {
          a(i)(j) = readInt()
        }
      }
      println("Enter second matrix")
      for (i <- 0 to (r1 - 1)) {
        for (j <- 0 to (c1 - 1)) {
          b(i)(j) = readInt()
        }
      }
      println("matrix first") // to display
      for (i <- 0 to (r - 1)) {
        println()
        for (j <- 0 to (c - 1)) {
          println("\t" + a(i)(j))
        }
      }
      println("matrix second")
      for (i <- 0 to (r1 - 1)) {
        println()
        for (j <- 0 to (c1 - 1)) {
          println("\t" + b(i)(j))
        }
      }
      for (i <- 0 to (r - 1)) {
        for (j <- 0 to (c1 - 1)) {
          d(i)(j) = 0
          for (k <- 0 to (c - 1)) {
            d(i)(j) = d(i)(j) + (a(i)(k) * b(k)(j))
          }
        }
      }
      println("Multiplication of matrix:-")
      for (i <- 0 to (r - 1)) {
        println()
        for (j <- 0 to (c1 - 1)) {
          println("\t" + d(i)(j))
        }
      }
    } // else

    var count = 0
    for (i <- 1 to (r - 1)) {
      for (j <- 0 to (i - 1)) {
        if (d(i)(j) != 0) {
          count = count + 1
        }
      }
    }
    if (count == 0) {
      println("matrix is upper triangular")
    } else {
      println("matrix is not upper triangular")
    }

  } // main

} //object
