
public class stringcalculator {

	public static void main(String[] args) {
		int x = 4;
		int y = 7;
		
		String calculator = "mul";
		
		switch (calculator) {
		case "add":
			int sum = x + y;
			System.out.println(sum);
			break;
		case "sub":
			int minus = x - y;
			System.out.println(minus);
			break;
		case "mul":
			int multi = x * y;
			System.out.println(multi);
			break;
		case "div":
			int division = x % y;
			System.out.println(division);
			
		
		}
		
		

	}

}
