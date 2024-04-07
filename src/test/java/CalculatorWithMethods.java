import java.util.Scanner;

public class CalculatorWithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
	        double num1, num2;
	        char operator;

	        System.out.print("Enter first number: ");
	        num1 = input.nextDouble();

	        System.out.print("Enter an operator: ");
	        operator = input.next().charAt(0);

	        System.out.print("Enter second number: ");
	        num2 = input.nextDouble();
	        input.close(); 

	        double result = calculate(num1, num2, operator);

	        if (result == Double.MAX_VALUE) {
	            System.out.println("Error: Invalid operator.");
	        } else {
	            System.out.println("Result: " + result);
	        }
	    }

	    public static double calculate(double num1, double num2, char operator) {
	        switch (operator) {
	            case '+':
	                return num1 + num2;
	            case '-':
	                return num1 - num2;
	            case '*':
	                return num1 * num2;
	            case '/':
	                if (num2 != 0) {
	                    return num1 / num2;
	                } else {
	                    return Double.MAX_VALUE;
	                }
	            default:
	                return Double.MAX_VALUE;
	        }
	}

}
