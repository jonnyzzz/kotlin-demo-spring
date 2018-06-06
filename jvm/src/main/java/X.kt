package org.jetbrains.demo

import corp.jpa.ConnectionAction
import corp.jpa.DBConnection
import corp.jpa.DBConnectionFactory

data class User2(var name: String?,
                 var hi: String)

private val factory = DBConnectionFactory()

inline fun <Y> runWithConnection(a: DBConnection.(Int) -> Y): Y {
  val c = factory.newConnection()
  try {
    return c.a(4)

  } finally {
    factory.returnConnection(c)
  }
}

fun testIt() {
  runWithConnection() {

    println(it)

    do3()

    doTheBestQuery()

  }
}