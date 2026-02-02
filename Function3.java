
import java.util.Scanner;

// make a function to multiply 2 numbers and return the product
public class Function3 { 

    public static int printProduct(int a ,int b) {
       return a* b;

    }
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();

        
        System.out.println("Product of 2 number is :" + printProduct(a, b));
    }
}
