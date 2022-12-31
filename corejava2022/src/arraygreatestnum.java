
public class arraygreatestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num[] = new int[] {4,5,6,7,8};
      int largest = num [0];
      int smallest = num[0];
      for(int i=0; i<num.length; i++) {
    	  if(num[i]>largest) {
    		  largest = num[i];
    	  }
    	  else if (num[i] < smallest) {
    		  smallest = num [i];
    	  }
    	
      }
      System.out.println("largest"+ largest);
 	 System.out.println("smallest"+ smallest);
 	 
	}

}
