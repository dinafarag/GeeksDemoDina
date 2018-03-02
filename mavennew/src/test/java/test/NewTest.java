package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void testToPass() {
	  Assert.assertEquals(1, 1);
  }
  
  @Test
  public void testTofail() {
	  Assert.assertEquals(1, 1);
  }
  
  
  
}
