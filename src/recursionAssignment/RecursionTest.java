package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
    
  /**
  * An initial test
  */
  @Test
  public void Test1(){
    assertEquals(1,Recursion.count8(8));
  }
  @Test
  public void Test2(){
    assertEquals(2, Recursion.count8(818));
  }
  @Test
  public void Test3(){
    assertEquals(3, Recursion.count8(8818));
  }
  public void Test4(){
    assertEquals("hel*lo", Recursion.pairStar("hello"));
  }
  public void Test5(){
    assertEquals("x*xy*y", Recursion.pairStar("xxyy"));
  }
  public void Test6(){
    assertEquals("a*a*a*a", Recursion.pairStar("aaaa"));
  }
}
