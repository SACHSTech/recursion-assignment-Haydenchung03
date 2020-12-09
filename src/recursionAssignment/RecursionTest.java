package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
    
  /**
  * An initial test
  */
  @Test
  public void Test1() {
    assertEquals(1, Recursion.count8(8));
  }
  @Test
  public void Test2() {
    assertEquals(2, Recursion.count8(818));
  }
  @Test
  public void Test3() {
    assertEquals(4, Recursion.count8(8818));
  }
  @Test
  public void Test4() {
    assertEquals("hel*lo", Recursion.pairStar("hello"));
  }
  @Test
  public void Test5() {
    assertEquals("x*xy*y", Recursion.pairStar("xxyy"));
  }
  @Test
  public void Test6() {
    assertEquals("a*a*a*a", Recursion.pairStar("aaaa"));
  }
  @Test
  public void Test7() {
    assertEquals("yza", Recursion.stringClean("yyzzza"));
  }
  @Test
  public void Test8() {
    assertEquals("abcd", Recursion.stringClean("abbbcdd"));
  }
  @Test
  public void Test9() {
    assertEquals("Helo", Recursion.stringClean("Hello"));
  }
}
