// Print the sum of all odd numbers from 1 to n

import java.util.*;

public class FunctionE2 {

    public static int printSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {   // odd number check
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       
        System.out.println("Sum of odd numbers = " + printSum(n));
    }
}
