import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter number: ");       
		    
		int num=sc.nextInt();  
		sc.close();
		for(int i=1; i <= 10; i++)  
		{  
		      
		System.out.println(num+" * "+i+" = "+num*i);  
		}  
	}

}
