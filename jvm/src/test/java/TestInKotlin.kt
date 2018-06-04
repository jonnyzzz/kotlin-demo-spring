package org.jetbrains.demo

import org.junit.Assert
import org.junit.Test


class TestInKotlin {

  @Test
  fun testMessage() {
    Assert.assertEquals("", "JUnit".helloMessage)
  }


  @Test
  fun `this test should check something useful`() {
  }


}