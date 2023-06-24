fun labelBreak() {
  loopI@ for (i in 1..10) {
	loopJ@ for (j in 1..10) {
	  println("$i x $j = ${i * j}")
	  if (j == 10) break@loopI
	}
  }
}

fun labelContinue() {
  loopI@ for (i in 1..10) {
	loopJ@ for (j in 1..10) {
	  if (j == 2) continue@loopJ
	  println("$i x $j = ${i * j}")
	}
  }
}

fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

fun main() {
//  labelBreak()
//  labelContinue()

  test("") test@{
	if (it == "") return@test else println("eko")
  }
  test("EKO") test@{
	if (it == "") return@test else println("eko")
  }
//  println("Eko")
}