fun factorialLoop(value: Int): Int {
  var result = 1
  for (i in value downTo 1) {
	result *= i
  }
  return result
}

fun factorialRecursive(value: Int): Int {
  return when (value) {
	1 -> 1
	else -> value * factorialRecursive(value - 1)
  }
}

fun factorialRecursive2(value: Int): Int {
  var total = 1
//  if (value == 1) return total
//  return value * factorialRecursive(value - 1)

  return if (value == 1) total else {
	value * factorialRecursive(value - 1)
  }
}

fun main() {
  println(factorialLoop(5))
  println(factorialRecursive(5))
  println(factorialRecursive2(5))
}