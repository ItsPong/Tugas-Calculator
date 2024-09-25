import java.util.*;

public class MainCalculator {
    public static void runCalculator() {
        Calculator calculator = new Calculator();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for add");
        System.out.println("Enter 2 for subtract");
        System.out.println("Enter 3 for multiply");
        System.out.println("Enter 4 for divide");
        int operator = sc.nextInt();
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        double result;

        switch (operator) {
            case 1:
                result = calculator.add(num1, num2);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                break;
            case 4:
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("The result is: " + result);
    }
}
