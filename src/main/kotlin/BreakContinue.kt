fun main() {
  var i = 0
  while (true) {
	println("Break to me $i")
	i++
	if (i > 100) {
	  break
	}
  }

  for (i in 1..100) {
	if (i % 2 == 0) {
	  continue
	}
	println("Angka $i")
  }
}