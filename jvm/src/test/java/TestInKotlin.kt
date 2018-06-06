package org.jetbrains.demo

import org.junit.Assert
import org.junit.Test


class TestInJava {

  @Test
  fun `this is a failing test for the demo`() {
    Assert.assertEquals("", hello("JUnit"))
  }

}
