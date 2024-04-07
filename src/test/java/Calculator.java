import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 
        
        System.out.print(
            "Enter the first and the Second number - ");
        int a = sc.nextInt();
        int b = sc.nextInt();
 
       
        System.out.print(
            "Enter the type of operation - ");
        char op = sc.next().charAt(0);
        sc.close(); 
        calculate(a, b, op);
    }
    public static int calculate(int a, int b, char op)
    {
        int ans = 0;
        // addition
        if (op == '+') {
            ans = a + b;
            // subtraction
        }
        else if (op == '-') {
            ans = a - b;
            // multiplication
        }
        else if (op == '*') {
            ans = a * b;
            // modulo
        }
        else if (op == '%') {
            ans = a % b;
            // division
        }
        else if (op == '/') {
            ans = a / b;
        }
 
        System.out.println("Your answer is - " + ans);
        return ans;
	}

}
