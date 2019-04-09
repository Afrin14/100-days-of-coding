import java.util.*;
import java.lang.*;

public class CodeUglyNumber{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();      //for finding nth ugly number
		
		System.out.println("The "+ n +"th ugly number is "+ UglyNumber(n));
	}

		static int UglyNumber(int n){

		int ugly[] = new int[n];   //to store the ugly numbers in an array;
		ugly[0] = 1;
		int i2; int i3; int i5;
		i2 = i3 = i5 = 0;
		int next_multiple_of_2 = ugly[i2]*2;
		int next_multiple_of_3 = ugly[i3]*3;
		int next_multiple_of_5 = ugly[i5]*5;

		 int next_ugly_number = 1;

		for(int i=1; i<n; i++){
			next_ugly_number = Math.min(next_multiple_of_2, Math.min(next_multiple_of_3, next_multiple_of_5));

			ugly[i] = next_ugly_number;

            if(next_ugly_number%2 == 0){
            	i2 = i2+1;
            	next_multiple_of_2 = ugly[i2]*2;
            }
			if(next_ugly_number%3 == 0){
            	i3 = i3+1;
            	next_multiple_of_3 = ugly[i3]*3;
            }
            if(next_ugly_number%5 == 0){
            	i5 = i5+1;
            	next_multiple_of_5 = ugly[i5]*5;
            }

        }
            


        return next_ugly_number;
}
		}



