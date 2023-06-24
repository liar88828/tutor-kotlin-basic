tailrec fun display(value: Int) {
  println("Recursive $value")
  if (value > 0) {
	display(value - 1)//+3 // tidak boleh ada penambahan
  }
}

tailrec fun factorialRecursives2(
  value: Int,
  total: Int = 1
): Int {
  return when (value) {
	1 -> total
	else -> factorialRecursives2(value - 1, value * total)
  }
}

fun main() {
  display(10)
  println(factorialRecursives2(10))
}