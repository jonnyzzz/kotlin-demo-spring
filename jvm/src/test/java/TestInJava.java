import org.jetbrains.demo.JvmKt;
import org.junit.Assert;
import org.junit.Test;

public class TestInJava {

  @Test
  public void testMessage() {
    Assert.assertEquals("", JvmKt.hello("JUnit"));
  }

}

