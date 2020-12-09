package recursionAssignment;
import java.io.*;

public class Recursion{
  // Program for counting number of 8 in number
  public static int count8(int intN){
    // If number of 8 is equal to 0, return 0
    if (intN == 0) {
      return 0;
    // If number is divided and the remainder is equal to 8 and the number divided is divided by 10 and the remainder is 8, run this code. Returns the value of the number divided by 10 and adds 2.
    } else if(intN % 10 == 8 && (intN / 10) % 10 == 8) {
      return 2 + count8(intN / 10);
    // If number is divided by 10 and the remainder is 8, run this code. Returns the value of the number divided by 10 and adds 1.
    } else if(intN % 10 == 8) {
      return 1 + count8(intN / 10);
    // If none of the other conditions run, this condition would run. Returns the value of the number divided by 10.
    } else {
      return count8(intN / 10);
    }
  }
  // Runs a program 
  public static String pairStar(String str){

    if (str.equals("") || str.length() == 1) {
      return str;
    } else if(str.charAt(0) == str.charAt(1)) {
      return str.charAt(0) + "*" + pairStar(str.substring(1));
    } else {
      return str.charAt(0) + pairStar(str.substring(1));
    }
  }
  public static String stringClean(String str) { 

    if(str.length() < 2) {
      return str;
    } else if(str.charAt(0) == str.charAt(1)) {
      return stringClean(str.substring(1));
    }
  return str.charAt(0) + stringClean(str.substring(1));
  }
}
