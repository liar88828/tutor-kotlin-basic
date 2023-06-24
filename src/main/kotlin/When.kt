fun main() {
  val finalExam = 'C'
  when (finalExam) {
	'A' -> {
	  println("Amazing")
	}

	'B' -> println("Good Job")
	'C' -> {
	  println("Good")
	}

	'D' -> println("Not Bad")
	'E' -> println("Try Again")
	else -> println("Notting")
  }

  when (finalExam) {
	'A', 'B', 'C' -> println("Selamat anda lulus")
	else -> println("Maaf, anda tidak lulus")
  }

  val passValue = arrayOf('A', 'B', 'C')
  when (finalExam) {
	in passValue -> println("pass")
//	else passValue -> println("loss")
	!in passValue -> println("loss")
  }

  val name = "eko"
  when (name) {
	is String -> println("Name Is String")
	!is String -> println("Name Is String")
  }
  val nilai = 81
  when {
	nilai > 90 -> println("Amazing")
	nilai > 80 -> println("Good Job")
	else -> println("Not bad")
  }
}