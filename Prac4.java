import java.util.Scanner;

public class Prac4 {

    // function to calculate x^n
    public static int calculatePower(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int power = calculatePower(x, n);
        System.out.println("x^n = " + power);
    }
}
