// Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    scanner.close();

    String binaryString = Integer.toBinaryString(n);
    String [] binaryArr = binaryString.split("0");
    int longest = binaryArr[0].length();
    for(String s:binaryArr) {
      if(s.length() > longest) {
        longest = s.length();
        }
    }

    System.out.println(longest);
  }
}
