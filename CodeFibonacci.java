import java.util.*;

  public class CodeFibonacci{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(fibonacci(n));
	}

	static int fibonacci(int n){    

		int arr[] = new int[n+2]; //Declare an array to store the fibonacci numbers, 1 extra to handle case n = 0   
		int i;      																							 
		arr[0] = 0;         //1st element in the series is 0 													 
		arr[1] = 1;			//2nd element in the series is 1													 

		for(i=2; i<=n; i++){																					
			arr[i] = arr[i-1] + arr[i-2];			//Add the previous 2 numbers and store the element in the array  
		}																										
		return arr[n];																							
	}

}

