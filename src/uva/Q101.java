package uva;

import java.util.Scanner;

class Q101 {
	static int array[][];
	static int max;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		max = in.nextInt();
		array = new int[max][max];
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				array[i][j] = -1;
			}
		}
		for (int i = 0; i < max; i++) {
			array[i][0] = i;
		}
		String s1, s2;
		while (!(s1 = in.next()).equals("quit")) {
			int a = in.nextInt();
			s2 = in.next();
			int b = in.nextInt();
			int index_a[] = find(a);
			int index_b[] = find(b);
			if (index_a[0] == index_b[0]) {
				continue;
			}
			
			if (s2.equals("onto")) {
				restore(index_b);
			}
			if (s1.equals("move")) {
				restore(index_a);
			}
			move(index_a, index_b);
			
			
		}
		for (int i = 0; i < max; i++) {
			System.out.printf("%d:", i);
			for (int j = 0; j < max; j++) {
				if (array[i][j] != -1) {
					System.out.printf(" %d",array[i][j]);
				}
				
			}
			System.out.println();
		}
		in.close();
	}
	
	static int[] find(int x) {
		int index[] = new int[2];
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				if (array[i][j] == -1) {
					break;
				}
				if (array[i][j] == x) {
					index[0] = i;
					index[1] = j;
					return index;
				}
			}
		}
		return index;
	}
	
	static void restore(int[] x) {
		for (int j = x[1] + 1; j < max; j++) {
			if (array[x[0]][j] == -1) {
				break;
			}
			int temp = array[x[0]][j];
			array[temp][0] = temp;
			array[x[0]][j] = -1;
		}
	}
	static void move(int[] a, int[] b) {
		int i = b[1] + 1;
		while (array[b[0]][i] != -1) {
			i++;
		}
		int j = a[1];
		while (array[a[0]][j] != -1) {
			array[b[0]][i++] = array[a[0]][j];
			array[a[0]][j] = -1;
			j++;
		}
		
	}
}
