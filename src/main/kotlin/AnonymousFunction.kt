val anomymousUpper = fun(value: String): String {
  return if (value == "") "UPS" else "Hello ${value.uppercase()}"
}

fun main() {
  println(anomymousUpper("eko"))
  println(anomymousUpper(""))
}