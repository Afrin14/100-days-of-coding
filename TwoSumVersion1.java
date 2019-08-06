
import java.io.IOException;
import java.util.*;
public class TwoSumVersion1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		try {
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int num[] = new int[n];
		for(int i = 0; i < n ; i++) {
			System.out.println("Enter the elements in the array");
			num[i] = sc.nextInt();
		}
		System.out.println("Enter the target");
		int target = sc.nextInt();
		printArray(num);
		
		twoSum(num, target);
		
	}finally {
		sc.close();
	}
	}

	static int[] twoSum(int[] num, int target) {
		int i = 0, j = num.length-1;
		
		int arr[] = new int[2];
		
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		for(int k = 0; k < num.length; k++) {
			if(!table.containsKey(num[k])) {
				table.put(num[k],k+1);
			}
			else if(num[k] * 2 == target) {
				arr[0] = table.get(num[k]);
				arr[1] = table.get(num[k]);
				System.out.println("Has duplicate elements and its sum is equal to the target");
				printArray(arr);
				return arr;
			}	
		}
		
		
		Arrays.sort(num);
		while(i < j){
			if(num[i] + num[j] > target)
				j--;
		
		else if(num[i] + num[j] < target)
					i++;
		
		else if	(num[i] + num[j] == target)
			{ 
			arr[0] = i;
			arr[1] = j;
			System.out.println("Sum is equal to the target, both numbers are not duplicates");
			printArray(arr);
			return arr;
			}
		}
		System.out.println("No two elements sum is equal to target");
		printArray(arr);
		return arr;
	}
		
	

	static void printArray(int num[]) {
		System.out.print("The elements in the array \n");
		for(int i = 0; i < num.length ; i++) 
			System.out.println(num[i] + " ");
	}
	
	
}
