fun printHello(name: String?): Unit {
  if (name == null) println("Hello Bro")
  println("Hello $name")
}

fun main() {
  printHello(null)
  printHello("Eko")
}