fun sum(a: Int, b: Int): Int {
  val total = a + b
  return total
}

fun div(a: Int, b: Int): Int {
  if (a == 0 || b == 0) return 0
  return a / b
}

fun main() {
  val result = sum(2, 3)
  println(result)
  println(sum(1, 2))

  println(div(9, 3))

}