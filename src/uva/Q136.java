package uva;


public class Q136 {
	public static void main(String[] args) {
		int num[] = new int[1500];
		num[0] = 1;
		int n2 = 0;
		int n3 = 0;
		int n5 = 0;
		int i = 1;
		while (i <= 1499) {
			while (2 * num[n2] <= num[i - 1]) {
				n2 ++;
			}
			while (3 * num[n3] <= num[i - 1]) {
				n3 ++;
			}
			while (5* num[n5] <= num[i - 1]) {
				n5 ++;
			}
			int min = Math.min(Math.min(2 * num[n2], 3 * num[n3]), 5 * num[n5]);
			num[i++] = min;
		}
		System.out.println("The 1500'th ugly number is " + num[1499] +".");

	}

}
