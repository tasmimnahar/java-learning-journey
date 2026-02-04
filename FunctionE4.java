import java.util.Scanner;

 // function to calculate area of a circle
    public class FunctionE4 {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();   // user input

        double area = calculateArea(r);
        System.out.println("Area of the circle: " + area);
    }
}
