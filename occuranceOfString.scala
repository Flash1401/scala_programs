// Write a program to read two strings. Find the occurrence of second string in the first string. Reverse the case of each occurrence in the string and display resultant string.
object occur {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in) // to take input from cmd
    println("Enter first string")
    val first = sc.nextLine()
    println("Enter second string")
    val second = sc.nextLine()
    if (first.contains(second) == true) {
      println("Second string is part of first string")
      /*var n= first.revers(second,null)
		println("After remove second in first string:-\t"+n)*/
    } else {
      println("Second String is not part of first string")
    }
  }
}
