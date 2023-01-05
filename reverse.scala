// Write a program to read a character and a string from user and remove first and last occurrence of the character from the string. Display resultant string after reversing its case.
object strrev {
  def reverseString(ch: Char): Char = {
    if (ch.isLower)
      ch.toUpper;
    else
      ch.toLower;
  }
  def main(args: Array[String]) {
    var ch = ' ';
    var str = " ";
    println("Enter String:");
    str = scala.io.StdIn.readLine();

    var str1 = new StringBuilder(str);
    println("Enter character:");
    ch = scala.io.StdIn.readChar();
    str1.deleteCharAt(str1.indexOf(ch.toString()));
    var str3 = str1.deleteCharAt(str1.lastIndexOf(ch.toString())).toString;
    var str4 = str3.map(reverseString)
    println(str4);
  }
}
