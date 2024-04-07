package Practice;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the two numbers:");

int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("Enter the operator:");

char op = sc.next().charAt(0);
sc.close();

calculate(a,b,op);

	}

	public static int calculate(int a, int b, char op) {
		
		int ans=0;
		if (op == '+') {
			ans = a+b;
		}
		else if(op == '-') {
			ans = a+b;
		}
		else if(op == '%') {
			ans = a+b;
		}
		else if(op == '*') {
			ans = a+b;
		}
		System.out.println("The result is:" + ans);
		return ans;
	}
}
