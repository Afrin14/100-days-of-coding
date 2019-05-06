import java.util.*;

public class LifeUniverseEverything{

public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int num;

		while(true){
			num = sc.nextInt();
			if(num != 42)
				System.out.println(num);
			else 
				break;
		}

	}
}
