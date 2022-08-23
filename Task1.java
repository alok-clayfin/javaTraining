package clayfinTrainee;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
		
		//int n = 687;
		 if(n>0 && n<1000) {
			 System.out.println(sumDigits(n));
		 }
        
    }

	
	static int sumDigits(int num) {
			int sum = 0;
         
			while (num > 0 || sum > 9)
	        {
	            if (num == 0) {
	                num = sum;
	                sum = 0;
	            }
	            sum += num % 10;
	            num /= 10;
	        }
	     
	    return sum;
	}

}
