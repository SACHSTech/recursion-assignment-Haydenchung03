package recursionAssignment;
import java.io.*;
public class Recursion{
  /**
  * Given a non-negative intN, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/)by 10 removes the rightmost digit (126 / 10 is 12).
  * @author H.Chung
  */
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
  /**
  *Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*"
  * @author H.Chung
  */
  public static String pairStar(String str){
    // If the string is equal to nothing or has 1 letter, just return the string. 
    if (str.equals("") || str.length() == 1) {
      return str;
    // If the character is the same to one another, add a star in the middle of the word
    } else if(str.charAt(0) == str.charAt(1)) {
      return str.charAt(0) + "*" + pairStar(str.substring(1));
    // If all other conditions fail, just print out the characters without a star in the middle
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
