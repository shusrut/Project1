
public class functionsum {
public static void sum()
{
	int num = 123, sum = 0, remainder;
	while(num>0) {
		remainder = num%10;
		sum = sum + remainder;
		num = num/10;
	}
	
	System.out.println("sum of the digits is"+sum);
}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sum();
	}

}