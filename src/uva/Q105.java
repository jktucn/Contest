package uva;

import java.util.Scanner;

public class Q105 {

	public static void main(String[] args) {
		int l, h, maxr =0, r = 0;
		int cor[] = new int[12000];

		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			l = in.nextInt();
			h = in.nextInt();
			r = in.nextInt();
			if (r > maxr) {
				maxr = r;
			}
			for (int i = l; i < r; i++) {
				if (h > cor[i]) {
					cor[i] = h;
				}
			}
			
		}
		// find first skyline
		int index = 0;
		while (cor[index] == 0) {
			index++;
		}
		int lastheight = cor[index];
		System.out.printf("%d %d ", index, lastheight);
		index++;
		for (;index <= maxr; index++) {
			if (cor[index] != lastheight) {
				lastheight = cor[index];
				System.out.printf("%d %d ", index, lastheight);
			}
		}
		in.close();

	}


}
