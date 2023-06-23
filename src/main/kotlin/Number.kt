fun main() {
    // underscore in number
    // disarankan  menggunakan val untuk number
    var age: Byte = 10
    val height: Int = 170
    val distance: Short = 2000
    val balance: Long = 1000000L
    println(age)
    println(height)
    println(distance)
    println(balance)

    // floating point number
    var value: Float = 98.98F
    var radius: Double = 23412342342.23423
    println(value)
    println(radius)

//    Literals
    var decimalLiteral: Int = 100
    var hexaDecimal: Int = 0xFF// henga decimal
    var binaryLiteral: Int = 0b0001 // biner
    println(decimalLiteral)
    println(hexaDecimal)
    println(binaryLiteral)

    // underscore in number
    var ages: Byte = 3_0
    var heights: Int = 2_70
    val distances: Short = 2_000
    val balances: Long = 1_000_000L
    println(ages)
    println(heights)
    println(distances)
    println(balances)

//    conversion
    var number: Int = 100
    // conversion
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

    println(number)
    println(byte)
    println(short)
    println(int)
    println(long)
    println(float)
    println(double)
}