package uva;

import java.util.Scanner;

public class Q12798 {

	public static void main(String[] args) {
		int ans, m, n;
		boolean found0 = false;
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			ans = 0;
			m = in.nextInt();
			n = in.nextInt();
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (in.nextInt() == 0) {
						found0 = true;
					}
				
				}
				if (!found0) {
					ans++;
				}
				found0 = false;
				
			}
			System.out.println(ans);
		}
		in.close();

	}

}
