//  inline fun helloInline(name: () -> String): String {
//	return "Hello ${name()}"
//  }
inline fun helloInline(
  firstName: () -> String,
  noinline lastName: () -> String,
): String {
  return "Hello ${firstName()} ${lastName()}"
}

fun main() {
//  println(helloInline { "eko" })
//  println(helloInline({ "kurniawan" }))
  println(helloInline({ "eko" }, { "kurniawan" }))
}