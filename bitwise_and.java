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

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int a0 = 0; a0 < t; a0++)   {
            int n = in.nextInt();
            int k = in.nextInt();

            int max = 0;
            for(int x = 1; x <= n; x++) {
                for(int y = 1; y <= n; y++) {
                    if(x < y) {
                        int current = x & y;
                        if(current > max && current < k) {
                            max = current;
                        }
                    }
                }
            }

            System.out.println(max);
        }
    }
}
