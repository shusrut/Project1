import java.util.Scanner;

public class takevaluesum {

	public static void main(String[] args) {
		int a,b,c;
		Scanner bc = new Scanner (System.in);
		System.out.println("enter first number");
			a= bc.nextInt();
			System.out.println("enter first number");
			b= bc.nextInt();
			c= a+b;
			System.out.println("sum of two numbers=" +c);
			bc.close();
		
	}

}
