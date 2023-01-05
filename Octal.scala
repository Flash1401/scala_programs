// Write a program to read five random numbers and convert it to binary and octal using user defined functions.
object conv {
  def binary(num: Int) {
    var bstr = " "; // binary String
    var rem = 0;
    println(num);
    var n1 = num;
    while (n1 > 0) {
      rem = n1 % 2;
      n1 = n1 / 2;
      bstr = rem + bstr;
    }
    println("Binary:" + bstr);
  }

  def octal(num: Int) {
    var ostr = " "; // binary String
    var rem = 0;
    println();
    println(num);
    var n1 = num;
    while (n1 > 0) {
      rem = n1 % 8;
      n1 = n1 / 8;
      ostr = rem + ostr;
    }
    println("octal:" + ostr);

  }

  def main(args: Array[String]) {
    val r = new scala.util.Random;
    binary(r.nextInt(15))
    octal(r.nextInt(15))
  }
}
