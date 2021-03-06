package org.jetbrains.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
  runApplication<DemoApplication>(*args)
}

@Controller
class MyController {

  @ResponseBody
  @RequestMapping("/time")
  fun dataAndTime(): String {
    val now = LocalDateTime.now()
    val dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")
    val result = dtf.format(now)
    return result
  }
}

