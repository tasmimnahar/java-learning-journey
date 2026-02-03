public class FunctionE4 {
  

    // function to calculate area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double r = 7;

        double area = calculateArea(r);
        System.out.println("Area of the circle: " + area);
    }


}
