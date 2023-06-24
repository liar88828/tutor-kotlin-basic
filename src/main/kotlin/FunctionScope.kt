fun HelloWorldDiLuar() {
  println("Hello world di luar")
}

fun main() {
  fun HelloWorldDiDalam() {
	println("Hello world di dalam")
  }
  HelloWorldDiDalam()
  HelloWorldDiLuar()
}