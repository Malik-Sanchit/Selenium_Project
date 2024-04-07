package Practice;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
System.out.println("Enter the two numbers:");

int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("Enter the Operator:");

char op = sc.next().charAt(0);

sc.close();

int result = calculator(a,b,op);

System.out.println("Result is:" + result);

}
public static int calculator(int a,int b,char op) {
	
	int result = 0;
	switch (op){
	case '+':
	return result = a+b;
	case '-':
		return result = a-b;
	case '%':
		return result = a%b;
	case '*':
		return result = a*b;
		default: return result;
		
	}
	
	
	
}
	
}
