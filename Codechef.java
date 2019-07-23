/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
	    
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	Scanner sc = new Scanner(System.in);
	//	int t = sc.nextInt();
	
	   // int t = Integer.parseInt(br.readLine());
		int n = 0;
		
		
		int t = -1;
    while (t == -1) {
        try {
        t = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
        System.out.println("Wrong input");
        }
    }
		
		while(t-- > 0){
		    // n = sc.nextInt();
		     n = -1;
    while (n == -1) {
        try {
        n = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
        System.out.println("Wrong input");
        }
    }
	//	     n = Integer.parseInt(br.readLine());
		     System.out.println(trailZeroes(n));
		}
	}
	
	static int trailZeroes(int n){
	    int zero = 0;
	    while(n > 0){
	        zero += n/5;
	        n /= 5;
	    }
	    
	    return zero;
	    
	}
}
