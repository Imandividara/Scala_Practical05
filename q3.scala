object Fibonacci {
  def main(args: Array[String]): Unit = {
    println("Enter the value of n:")
    val n = scala.io.StdIn.readInt()
    println(s"First $n Fibonacci numbers:")
    for (i <- 0 until n) {
      print(s"${fibonacci(i)} ")
    }
  }

  def fibonacci(n: Int): Int = {
    if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
}
