fun main() {
  val members: Array<String> = arrayOf("Eko", "Joko", "Budi")
  val values: Array<Byte> = arrayOf(100, 90, 59)
  val balances: Array<Int> = arrayOf(10_000, 200_000, 30_000)
  println(members)
  println(values)
  println(balances)

  val eko = members[0]
  val joko = members.get(1)
  val budi = members[2]
  println(eko)
  println(joko)
  println(budi)

  members.set(0, "Amar")
  val amar = members[0]
  members[1] = "Rudi"
  println(amar)
  println(members[1])

  val names: Array<String?> = arrayOfNulls(2)// harus ada 3 list
  println(members[0])
  names[0] = "Eko"
  names[1] = "Kurniawan"
  names[2] = "Khanedy"
//  names[3] = "Khanedy" //karena size harus 3 list
  println(names[0])
  println(names[1])
  println(names[2])
//  println(names[3])
}