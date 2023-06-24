fun SayHelloIf(name: String = ""): String {
  return if (name == "") {
	"Hello Bro"
  } else {
	"Hello $name"
  }
}

fun SayHelloWhen(name: String = ""): String {
  return when (name) {
	"" -> "Hello Bro"
	else -> "Hello $name"
  }
}

fun main() {
  println(SayHelloIf("eko"))
  println(SayHelloIf())
  println(SayHelloWhen("eko"))
  println(SayHelloWhen())
}