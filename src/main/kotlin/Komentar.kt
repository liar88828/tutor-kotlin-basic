/**
 * This multi line comment
 */
/**
 *
 */
fun contohFungsi(
  name: String// tambahkan parameter
): String// pengembaliannya harus string
{
  return "Hello $name"// value yang akan dikembalikan
}

fun main() {
//  single line comments
  val hello = contohFungsi(
	"Eko"// akan di beri value
  )// contoh memanggil fungsi

  println(hello)// akan di tampilkan
}