
public class checkprime {

	public static void main(String[] args) {
		
		int num = 7;
		boolean check = false;
		for(int i = 2; i < num; i++) {
			if (num == 2) {
				break;
				
			}
			if (num % i == 0) {
				check = true;
				
			}
		}
        if (check) {
        	System.out.println(num + "is not a prime number");
        	
        }else {
        	System.out.println(num + "is a prime number");
        }
	}

}
