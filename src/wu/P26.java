package wu;

import java.util.Arrays;

public class P26 {
	static int memo[] = new int[1000];

	public static void main(String[] args) {
		System.out.println(fact(5));
		// take too long to finish
		//System.out.println(fib(500));
		System.out.println(fibmemo(500));
		System.out.println(Arrays.toString(memo));

	}
	
	static int fact(int n) {
		if (n == 0)
			return 1;
		return n * fact(n - 1);
	}
	
	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}
	// with memo
	static int fibmemo(int n) {
		if (n <= 1)
			return n;
		if (memo[n] != 0)
			return memo[n];
		return memo[n] = fibmemo(n - 1) + fibmemo(n - 2);
	}

}
