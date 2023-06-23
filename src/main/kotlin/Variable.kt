
fun main() {



  var firstName: String = "Eko"
  var lastName = "Khannedy"
  // mengubah variable
  lastName = "Kurniawan Khanedy"
  println(firstName)
  println(lastName)

  val lastName2 = "khanedy"
  //  error jika di ubah
  //  lastName2='tidak bisa di ubah'

  var firstName2: String? = "Eko"
  firstName2 = null
  println(firstName2)
  // error kareba firstName bisa null
  // println(firstName2.length)
  // cara mengakses yang benar
  println(firstName2?.length)
  firstName2 = "Eko"
  println(firstName2)


println(APPLICATION)
println(VERSION)
}
const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"