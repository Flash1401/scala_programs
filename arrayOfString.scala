// Create array of strings and read a new string from user. Display all the strings from the array that contain the new string.
object strdisp {
  def main(args: Array[String]) {
    var str: Array[String] =
      Array("HelloGoodMorning", "HelloGoodNight", "HelloGoodAfternoon")
    var str1 = " "
    println("Enter string:")
    str1 = readLine()
    var str2 = str :+ str1
    for (j <- str2) {
      println(j)
    }
  }
}
