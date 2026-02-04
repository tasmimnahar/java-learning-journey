//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.Scanner;

public class FunctionE5 {

    public static boolean printAge(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (printAge(age)) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not eligible for vote");
        }
    }
}

