package recursionAssignment;
import java.io.*;

public class Recursion{

  public static int count8(int intN){

    if (intN < 1) {
      return 0;
    } else if(intN % 10 == 8 && (intN / 10) % 10 == 8) {
      return 2 + count8(intN / 10);
    } else if(intN % 10 == 8) {
      return 1 + count8(intN / 10);
    } else {
      return count8(intN / 10);
    }
  }
  public static String pairStar(String str){

    if (str.equals("") || str.length() == 1) {
      return str;
    } else if(str.charAt(0) == str.charAt(1)) {
      return str.charAt(0) + "*" + pairStar(str.substring(1));
    } else {
      return str.charAt(0) + pairStar(str.substring(1));
    }
  }
}
