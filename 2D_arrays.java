// Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

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
    int[][] arr = new int[6][6];
    for (int i = 0; i < 6; i++) {
      String[] arrRowItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int j = 0; j < 6; j++) {
        int arrItem = Integer.parseInt(arrRowItems[j]);
        arr[i][j] = arrItem;
      }
    }

    scanner.close();

    int counter = 0;
    int[] sum = new int[16];
    for(int i = 0; i < 4; i++) {
      for(int j = 0; j < 4; j++) {
        sum[counter] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
        arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] +
        arr[i + 2][j + 2];

        counter++;
      }
    }
    //sort the array, print out the value in the last position
    Arrays.sort(sum);
    System.out.println(sum[15]);
  }
}
