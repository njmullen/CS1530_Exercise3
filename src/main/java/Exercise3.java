import java.util.*;

public class Exercise3 {
	
	public static void main(String[] args){
		
		int n = getNumber(args);
		if (n <= 0){
			System.err.println("Invalid arguments; Enter one integer > 0");
			System.exit(1);
		}

		int triangleResult = triangleSum(n);
		System.out.println("Tri(" + n + ") = " + triangleResult);
		
		int lazyResult = lazyCaterer(n);
		System.out.println("Lazy(" + n + ") = " + lazyResult);


	}

	public static int getNumber(String[] temp){
		if (temp == null){
			return -1;
		}
		if (temp.length != 1){
			return -1;
		} else {
		try {
			return Integer.parseInt(temp[0]);
			} catch (Exception ex){
				return -1;
			}
		}
	}

	public static int lazyCaterer(int n){
		if (n <= 0){
			return -1;
		}

		int p = (n*n + n + 2)/2;
		return p;
	}

	public static int triangleSum(int n){
		if (n <= 0){
			return -1;
		}
		
		int triangleSum = 0;
		for (int i = 0; i <= n; i++){
			triangleSum += i;
		}
		return triangleSum;
	}

}