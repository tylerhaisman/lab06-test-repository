//importing scanner
import java.util.Scanner;

public class addTwoNumbers {
    public static void main(String[] args) {
        //initializing scanner
        Scanner scanner = new Scanner(System.in);
        int result = 0
        //prompting the user for two numbers and storing them into variables "num1" and "num2"
        System.out.println("Input first number");
        int num1 = scanner.nextInt();
        System.out.println("Input second number");
        int num2 = scanner.nextInt();
        
        System.out.println("Type 1 for addition and 2 for subtraction");
        if(scanner.nextInt() == 1){
            //storing the resulting sum of the two variables into "result"
        result = num1 + num2;
        }
        else{
            //storing the resulting difference of the two variables into "result"
        result = num1 - num2;
        }
     
        //printing the result of the two variables
        System.out.println(result);
    }
}