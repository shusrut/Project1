
public class reverse123 {
public static void reverse (int num) {
	int reverse=0;
	while(num >=1) {
		
		int remainder = num%10;
		reverse = reverse * 10 + remainder;
		num =num/10;
		
	}
	System.out.println("reverse is"+reverse);
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      reverse (123);
	}

}
