import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int dueDay = sc.nextInt();
        int dueMonth = sc.nextInt();
        int dueYear = sc.nextInt();

        int fine;

        if (year > dueYear) {
            fine = 10000;
        } else if (month > dueMonth && (year >= dueYear)) {
            fine = 500 * (month - dueMonth);
        } else if (day > dueDay && (month >= dueMonth) && (year >= dueYear)) {
            fine = 15 * (day - dueDay);
        } else {
            fine = 0;
        }
        System.out.println(fine);

        sc.close();
    }
}
