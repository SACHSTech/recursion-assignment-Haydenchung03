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
    public void Test2(){
      assertEquals(2, Recursion.count8(818));
    }
    public void Test3(){
      assertEquals(4, Recursion.count8(8818));
    }
}
