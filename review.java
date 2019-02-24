Given a string S of length N that is indexed from 0 to N - 1, print its even-indexed and odd-indexed
characters as 2 space-separated strings on a single line.

Note: 0 is considered to be an even index.

Input Format
The first line contains an integer, T (the number of test cases).
Each line i of the T subsequent lines contain a String, S.

Output Format
For each String S (where 0 <= j <= T - 1 ), print S even-indexed characters, followed by a space,
followed by S odd-indexed characters.


import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int testCases = scanner.nextInt();
    scanner.nextLine();
    String s = "";
    int strlen;
    String even = "";
    String odd = "";

    for(int i = 0; i < testCases; i++) {

      s = scanner.nextLine();
      strlen = s.length();
      even = "";
      odd = "";

      for(int j = 0; j < strlen; j++) {
        if(j % 2 == 0) {
          even = even + s.charAt(j);
        } else {
          odd = odd + s.charAt(j);
        }
      }
      System.out.println(even + " " + odd);
    }
  }
}

