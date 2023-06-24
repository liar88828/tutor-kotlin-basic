import java.util.*

infix fun String.to(type: String): String {
  if (type == "UP") return this.uppercase()
  if (type == "DOWN") return this.lowercase()
  return this
}

fun main() {
  println("eko" to "UP")
  println("EKO" to "asdasd")
  println("EKO".to("DOWN"))
}