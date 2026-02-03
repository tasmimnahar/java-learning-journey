public class FunctionE3 {
   

    // function to return the greater of two numbers
    public static int findGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 25;

        int greater = findGreater(x, y);
        System.out.println("Greater number is: " + greater);
    }


}
