package wu;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test {
	
	

	public static void main(String[] args) throws FileNotFoundException {
		int q = 0;
		for (int j = 1; j <= 7; j++) {
			if (q < 22)
			q = q + (j * 5);
		}
		System.out.println(q);
	}

}
