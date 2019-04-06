import java.util.*;

public class CodSubsetSum{

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter elements into the array");
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the sum value");
		int sum = sc.nextInt();
        System.out.println("Control going to the SubsetSum method");
		System.out.println("The subset sum is"+ SubsetSum(arr,n,sum) );
		System.out.println("Thansk you. we are at the end of the code");

	}

	static boolean SubsetSum(int input[], int n ,int sum){
		System.out.println("Control inside SubsetSum method");            
			boolean T[][] = new boolean[n+1][sum+1];                     

		for(int i=0; i <= n; i++){                                       
			T[i][0] = true;                                              
		}                                                                
		for(int i=1; i<=n; i++){                           
			for(int j=1; j<=sum; j++){                                   
				if(j<input[i-1])                                         
					T[i][j] = T[i-1][j];                                 
				else                                                     
				T[i][j] = T[i-1][j] || T[i-1][j-input[i-1]];         
			}                                                            
		}                                                                
    	System.out.println("Now printing the value of the table");

			for(int i=0; i<n; i++){                    
			for(int j=0; j<sum; j++){                    
					System.out.print(T[i][j]);
				}
				System.out.println();
			}
		return T[n][sum];

	}
}