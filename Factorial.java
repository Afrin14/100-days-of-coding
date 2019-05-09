/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Factorial
{
	public static void main (String[] args) throws IOException
	{
	    
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	Scanner sc = new Scanner(System.in);
	//	int t = sc.nextInt();
	
	    int t = Integer.parseInt(br.readLine());
		int n = 0;
		
		while(t-- > 0){
		    // n = sc.nextInt();
		     
		     n = Integer.parseInt(br.readLine());
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
