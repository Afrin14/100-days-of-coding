import java.util.*;

public class CodeKnapsackProblem{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	int val[] = new int[n];
	int wt[] = new int[n];

	int t_w = sc.nextInt();

	for(int i=0; i<n; i++){
		val[i] = sc.nextInt();
			}


	for(int i=0; i<n; i++){
		wt[i] = sc.nextInt();
			}

	System.out.println(Knapsack(t_w, wt, val, n));				 
}
/*
static int max(int a, int b){
	return (a > b)? a:b;

}

static int Knapsack(int o, int wt[], int val[], int n){
	int i, w;

	int k[][] = new int[n+1][o+1];

	 for(i = 0; i<=n;i++){
	 	for(w=0; w<=o; w++){
	 		if(i==0 || w==0)
               k[i][w] = 0;
           else if(wt[i-1] <= w){
           	k[i][o] = max(val[i-1] + k[i-1][w-wt[i-1]], k[i-1][w]);
           }else{
           	k[i][w]=k[i-1][w];
           }
       }
   }
       return k[n][o];
   }      */
   




// A Dynamic Programming based solution for 0-1 Knapsack problem 
  
    // A utility function that returns maximum of two integers 
    static int max(int a, int b) { return (a > b)? a : b; } 
       
   // Returns the maximum value that can be put in a knapsack of capacity W 
    static int Knapsack(int w, int wt[], int val[], int n) 
    { 
         int i, j; 
     int K[][] = new int[n+1][w+1]; 
       
     // Build table K[][] in bottom up manner 
     for (i = 0; i <= n; i++) 
     { 
         for (j = 0; j <= w; j++) 
         { 
             if (i==0 || j==0) 
                  K[i][j] = 0; 
             else if (wt[i-1] <= j) 
                   K[i][j] = max(val[i-1] + K[i-1][j-wt[i-1]],  K[i-1][j]); 
             else
                   K[i][j] = K[i-1][j]; 
         } 
      } 
       
      return K[n][w]; 
    } 
}
