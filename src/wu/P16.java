package wu;

import java.util.Scanner;

public class P16 {
	//declaring global variables
	static int n;
	static int a[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			// n is number of bar
			System.out.print("Input n --> ");
			n = in.nextInt();
			if (n == 0) {
				break;
			}
			// a[i] is the length of ith bar
			a = new int[n];
			System.out.print("Input ai seperated by space --> ");
			for(int i = 0; i < a.length; i++){
				a[i] = in.nextInt();
			}
			solve();
		}
		in.close();
	}

	static void solve(){
		int ans = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					// circumference of the triangle
					int length = a[i] + a[j] + a[k];
					// max side 
					int max = Math.max(Math.max(a[i], a[j]), a[k]);
					// sum of the rest sides
					int rest = length - max;
					// test if the triangle is legal
					if (max < rest) {
						// update ans if find a bigger ans
						ans = Math.max(ans, length);
					}
				}
			}
		}
		System.out.println(ans);
	}
}
