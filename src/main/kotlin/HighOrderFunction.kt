fun helloHighOrder(
  name: String,
  transformer: (String) -> String
): String {
  val nameTransform = transformer(name)
  return "Hello $nameTransform"
}

fun main() {
  val lambdaUpper = { value: String -> value.uppercase() }
  println(helloHighOrder("Eko", lambdaUpper))
  println(helloHighOrder("EKO", { value: String -> value.lowercase() }))

  val result = helloHighOrder("EKO") { value: String -> value.lowercase() }
  println(result)
}