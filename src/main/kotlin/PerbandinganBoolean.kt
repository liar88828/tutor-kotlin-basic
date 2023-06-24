fun main() {

  val finalExam = 80
  val attendant = 80
  val extra = 60

  val passFinalExam = finalExam > 75
  val passAttendant = attendant > 75
  val passExtra = extra > 75
  
  val pass = passFinalExam && passAttendant && passExtra
  println(pass)
}
