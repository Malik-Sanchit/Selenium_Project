import java.util.Scanner;

public class SumMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Two number: ");  
	      Scanner sc = new Scanner(System.in);  
	      int a = sc.nextInt();  
	        int b = sc.nextInt();  
	        sc.close();  
	        
	        System.out.println("The sum of a and b is = " + Integer.sum(a, b));  
	}

}
