package wu;

import java.util.Scanner;

public class P18 {
	// length of the rod
	static int l;
	// number of ants
	static int n;
	// position of each ant
	static int x[];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input length of the rod --> ");
		l = in.nextInt();
		System.out.print("input number of ants --> ");
		n = in.nextInt();
		x = new int[n];
		System.out.print("input positioin of each ant seperate by space --> ");
		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
		}
		solve();
		in.close();
	}
	
	static void solve() {
		// shortest time
		int minT = 0;
		for (int i = 0; i < n; i++) {
			minT = Math.max(minT, Math.min(x[i], l - x[i]));
		}
		// longest time
		int maxT = 0;
		for (int i = 0; i < n; i++) {
			maxT = Math.max(maxT, Math.max(x[i], l - x[i]));
		}
		System.out.println("min = " + minT);
		System.out.println("max = " + maxT);
	}

}
