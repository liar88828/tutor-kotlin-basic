fun main() {
  var counter: Int = 0
  val lambdaIncrement: () -> Unit = {
	println("Lambda increment ")
	counter++
  }

  val anonymouseIncrement = fun() {
	println("anonymouse Increment")
	counter++
  }

  fun functionIncrement() {
	println("Function Increment")
	counter++
  }

  lambdaIncrement()
  anonymouseIncrement()
  functionIncrement()
  println(counter)
}