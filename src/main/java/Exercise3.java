import java.util.*;

public class Exercise3 {
	
	public static void main(String[] args){
		
		int n = 0;
		try {
			n = Integer.parseInt(args[0]);
		} catch (Exception ex){
			System.err.println("Invalid argument exception; must enter integer > 0");
			System.exit(1);
		}

		if (n <= 0){
			System.err.println("Integer must be > 0");
			System.exit(1);
		}

		int triangleResult = triangleSum(n);
		System.out.println("Tri(" + n + ") = " + triangleResult);
		
		int lazyResult = lazyCaterer(n);
		System.out.println("Lazy(" + n + ") = " + lazyResult);


	}

	public static int lazyCaterer(int n){
		int p = (n*n + n + 2)/2;
		return p;
	}

	public static int triangleSum(int n){
		int triangleSum = 0;
		for (int i = 0; i < n; i++){
			triangleSum += i;
		}
		return triangleSum;
	}

}