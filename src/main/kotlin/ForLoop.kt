fun main() {

  val names = arrayOf("EKO ", "KURNIAWAN ", "KHANEDY ")
  var total = 0
  for (name in names) {
	print(name)
	total++
  }
  print(total)
  println()

  for (value in 0..10) {
	print("$value, ")
  }
  println()

  for (value in 100 downTo 0 step 5) {
	print("$value, ")
  }
  println()
  var ukuranArray = names.size - 1
  for (i in 0..ukuranArray) {
	println(names[i])
  }
}