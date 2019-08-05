import java.io.IOException;
import java.util.Scanner;

public class MoveZero {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int num[] = new int[n];
		System.out.println("Enter the elements in the array");
		for(int i =0; i < n; i++) {
			System.out.println("Enter the element");
			num[i] = sc.nextInt();
		}	
		printMoveZeroToEnd(num, n);
		System.out.println("The elements of the array are:");
		for(int i = 0; i < n; i++) {
			System.out.print(num[i] + " ");
		 }
		}finally {
			sc.close();
		} 
	}
     static void printMoveZeroToEnd(int[] num, int n) {
		// TODO Auto-generated method stub
    	 int count = 0;
    	 for(int i = 0; i < n; i++) {
    		 if(num[i] != 0)
    			 num[count++] = num[i];
    	 }
    	 while(count < n) {
    		 num[count++] = 0;
    	 }	 
	}
}
