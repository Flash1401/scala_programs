
// Write a program for multiplication of two matrices. Find determinant of resultant matrix.
object matmult
{
	def main(args:Array[String])
	{
		val arr1=Array.ofDim[Int](2,2)  //1st array
		val arr2=Array.ofDim[Int](2,2)  //2nd array
		var rarry=Array.ofDim[Int](2,2)  //resultant Array
		println("Enter Matrix1")
		for(i<-0 to 1)
		{
			for(j<-0 to 1)
			{
				arr1(i)(j)=readInt() //read Array1 element
			}
		}
		println("Enter Matrix2")
		for(i<-0 to 1)
		{
			for(j<-0 to 1)
			{
				arr2(i)(j)=readInt() //read Array2 element
			}
		}
		println("MATRIX -1")
		for(i<-0 to 1)
		{
			for(j<-0 to 1)
			{
				print(arr1(i)(j)+" ")  //print Array Element
			}
			println();
		}
		println("MATRIX -2")
		for(i<-0 to 1)
		{
			for(j<-0 to 1)
			{
				print(arr2(i)(j)+" ")  //print Array Element
			}
			println();
		}
		for(i<-0 to 1)
		{
			for(j<-0 to 1)
		   {
			rarry(i)(j)=0;
			for(k<-0 to 1)
				rarry(i)(j)=rarry(i)(j)+arr1(i)(k)*arr2(k)(j)  //multiplication
		   }
		}
		println("RESULTANT MATRIX")
		for(i<-0 to 1)
		{
			for(j<-0 to 1)
			{
				print(rarry(i)(j)+" ") //print Array Element
			}
			println()
		}
		var det=(rarry(0)(0)*rarry(1)(1))-(rarry(0)(1)*rarry(1)(0))
		println("Determinant:"+det);
	}
}
