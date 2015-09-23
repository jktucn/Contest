package uva;

import java.io.IOException;
import java.util.Scanner;

public class Q12700 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int caseNum = in.nextInt();
		int n, b, w, a, t;
		for (int i = 1; i <= caseNum; i++) {
			n = in.nextInt();
			b = w = a = t = 0;
			String s = in.next();
			for (int j = 0; j < n; j++) {
				char c = s.charAt(j);
				if (c == 'B')
					b++;
				else if (c == 'W')
					w++;
				else if (c == 'A')
					a++;
				else
					t++;
			}
			System.out.printf("Case %d: ", i);
			if (a == n)
				System.out.println("ABANDONED");
			else if (b + a == n)
				System.out.println("BANGLAWASH");
			else if (w + a == n)
				System.out.println("WHITEWASH");
			else if (b == w)
				System.out.printf("DRAW %d %d\n", b, t);
			else if (b > w)
				System.out.printf("BANGLADESH %d - %d\n", b, w);
			else if (b < w)
				System.out.printf("WWW %d - %d\n", w, b);

		}
		in.close();
	}

}
