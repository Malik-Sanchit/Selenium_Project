package Practice;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
Scanner sc = new Scanner(System.in);

System.out.println("enter the number:" );
int c = sc.nextInt();
sc.close();
for(i=1; i<=10; i++)
{
	int D = c*i;
	System.out.println(i + "*" + c + " = " + D);
}
	}

}
