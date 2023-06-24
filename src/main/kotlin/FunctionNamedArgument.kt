fun fullName(
  firstName: String,
  middleName: String,
  lastName: String
) {
  println("Hello $firstName $middleName $lastName")
}

fun main() {
  fullName(lastName = "Eko", firstName = "Kurniawan", middleName = "Khanedy")
}