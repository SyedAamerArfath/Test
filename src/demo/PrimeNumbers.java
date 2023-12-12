package demo;

public class PrimeNumbers {

	    public static void main(String[] args) {
	        int c = 0;
	        for (int i = 2; c < 50; i++) {
	            int count = 0;
	            for (int j = 2; j * j <= i; j++) {
	                if (i % j == 0) {
	                    count++;
	                    break;
	                }
	            }
	            if (count == 0) {
	                System.out.println(i);
	                c++;
	            }
	        }
	    

	}

}
