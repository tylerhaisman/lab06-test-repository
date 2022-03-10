//importing scanner
import java.util.Scanner;

public class addTwoNumbers {
    public static void main(String[] args) {
        //initializing scanner
        Scanner scanner = new Scanner(System.in);
        //prompting the user for two numbers and storing them into variables "num1" and "num2"
        System.out.println("Which numbers would you like to add?");
        System.out.println("Input first number");
        int num1 = scanner.nextInt();
        System.out.println("Input second number");
        int num2 = scanner.nextInt();

        //storing the resulting sum of the two variables into "result"
        int result = num1 + num2;

        //printing the result of the two variables
        System.out.println(result);
    }
}