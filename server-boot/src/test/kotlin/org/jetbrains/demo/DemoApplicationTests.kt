package org.jetbrains.demo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*


@RunWith(SpringRunner::class)
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = RANDOM_PORT)
class DemoApplicationTests {
  @Autowired
  lateinit var mockMvc: MockMvc

  @Test
  fun contextLoads() {
  }

  @Test
  fun testCurrentTime() {
    mockMvc.perform(get("/time"))
            .andDo(print())
            .andExpect(status().isOk)
  }
}
