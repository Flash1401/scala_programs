// Create lists using five different methods and display each of them.(List style, java style, fill, range, tabulate methods)
object list1 {
  def main(args: Array[String]) {
    // For creating in lisp style
    val list = 10 :: 20 :: 30 :: Nil
    println("Lisp style is:-" + list)

    // For creating in Java style
    val list2 = List(11, 22, 33)
    println("Java style is:-" + list2)

    // For creating in fill
    val x3 = List.fill(3)("food") //  it will print food 3 times
    println("Fill is:-" + x3)

    // For creating in range
    val x1 = List.range(1, 10)
    println("Range is:-" + x1) // it will print from 1 to 9

    // For creating tabulate method
    val x4 =
      List.tabulate(5)(n => n * n) // it will print square of nos from 0 to 4
    println("Tabulated Format is:-" + x4)
  }
}
