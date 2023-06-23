fun main() {
    var firstName: String = "Eko"
    var lastName: String = "Khanedy"

    var address: String = """
        Jalan belum jadi
        provinsi jawa barat
        kota subang
        indonesia
    """.trimIndent()

    var address2: String = """
        >Jalan belum jadi
        >kota subang
        >provinsi jawa barat
        >indonesia
    """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)
    println(address2)

    var fullName: String = firstName + " " + lastName
    println(fullName)

    var fullName2:String="$firstName $lastName"
    var desc:String ="total $fullName2 char = ${fullName2.length}"

    println(fullName2)
    println(desc)
}