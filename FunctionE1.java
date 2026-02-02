// Enter 3 number from the user &make a function to print their avg
import java.util.Scanner;

public class FunctionE1 {
    public static float average(int a, int b, int c) {
        return (a + b + c) / 3.0f;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(" Average :"+ average(a, b, c));
    }
}
