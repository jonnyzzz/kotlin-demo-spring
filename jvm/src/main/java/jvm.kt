package org.jetbrains.demo

import java.util.concurrent.Callable


fun main(names: Array<String>) {
  println(hello(name = "eugene"))

  println(hello(
          hi = "Gruß Gott",
          name = "Passau"
  ))

  names.forEach { name ->
    val message = name.helloMessage

    println(message)
  }
}

class DBConnection {
  fun something() {}
  fun release() : Unit = TODO()
}


inline fun <Y> runUnderConnection(p: String, action: DBConnection.() -> Y) : Y {
  val con = DBConnection()
  try {
    return action(con)
  } finally {
    con.release()
  }
}

fun usage() {
  runUnderConnection(p = "foo") {
    something()
  }
}


fun ho(x : (Int, String) -> Unit) {
  x(34, "42")
}

val String.helloMessage
  get() : String {
    return hello(this)
  }


fun String.formatHelloMessage(): String {
  return hello(this)
}

fun hello(name: String, hi: String = guessHello(name)) = "$hi ${name.capitalize()}"

sealed class E {
  class A(val x : Double) : E()
  class B(val y : Int) : E()
          class C(val z : String) : E() }

fun x(w: E) = when(w) {
  is E.A -> w.x.toInt()
  is E.B -> w.y
  is E.C -> w.z.toInt()
}



fun guessHello(name: String): String {
  val u = findUser(name)

  return u?. hello ?: when {
    name.equals("eugene", ignoreCase = true) -> "Privet"
    name == "Passau" -> "Servus"
    else -> "Hello"
  }
}

fun findUser(name: String) : KUserPOJO? {
  return null
}


data class KUserPOJO(
        var name: String? = null,
        var uuid: String? = null,
        var bar: String,
        var hello: String? = null
)

val foo = KUserPOJO(bar = "3").copy(uuid = "42")

