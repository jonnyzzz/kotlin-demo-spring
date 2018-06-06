package org.jetbrains.demo

import corp.jpa.CorpUser

fun main(names: Array<String>) {
  println(hello(
          hi = "Servus",
          name = "Passau"
  ))

  for (name in names) {

    val s = hello(name)


    println(s)
  }
}

val String.hi
  get() = hello(this)

fun String.helloMessage() = hello(this)

fun hello(name: String,
          hi : String = generateHello(name))

        = "$hi, $name!"

fun findHello(name: String) : String ? {
  return null
}


fun foo(x: Any? ) {

  CorpUser("a", "b").hi = "ddd"


  val x = findHello("a") ?. chars() ?: return


  if (x == null) return

  x.hashCode()

  if (x is NullPointerException) {
    val z = x.stackTrace
  }


}

fun generateHello(name: String): String {

  return when (name) {
    "Passau" -> "Servus"
    "Eugene" -> "Hi"
    else -> "Hi"
  }



}