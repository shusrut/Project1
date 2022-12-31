import java.util.Scanner;

public class takevaluemultiply {

	public static void main(String[] args) {

int a,b,c;
Scanner sp = new Scanner (System.in);
System.out.println("enter first number");
a = sp.nextInt();
System.out.println("enter second number");
b = sp.nextInt();
c = a*b;
System.out.println("product of two numbers=" +c);
sp.close();

	}

}
