fun main() {
  val contohLambda: (String, String) -> String = { firstName,
												   lastName: String ->
	val result = "$firstName $lastName"
	result
  }
  var result = contohLambda("eko", "kurniawan")
  println(result)

  val contohLambdas2: (String) -> String = { "Hello ${it.uppercase()}" }
  var result2 = contohLambdas2("eko")
  println(result2)

  var lambdaNames: (String) -> String = ::ToUpperCases
  println(lambdaNames("kurniawan"))
}

fun ToUpperCases(value: String): String = value.uppercase()
