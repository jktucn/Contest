package wu;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Sentence {
	public static void main(String[] args) throws IOException {
		InputStream ins = new FileInputStream(new File("PracticeInput.txt"));
		InputStreamReader in = new InputStreamReader(ins);
		int ch;
		char c;
		// if flag is true, print a capital char, else print a lower case char
		boolean flag = true;
		// read until the end of the file
		while((ch = in.read()) != -1) {
			c = (char) ch;
			if (flag){
				// print a upper case letter and set flag to false
				if ( c >= 'a' && c <= 'z'){
					System.out.print(Character.toUpperCase(c));
					flag = false;
				}
				else {
					System.out.print(c);
					// if the next letter is upper case, reset the flag
					if ( c >= 'A' && c <= 'Z' ) {
						flag = false;
					}
				}
			}
			else {
				// print a lower case letter
				if ( c >= 'A' && c <= 'Z') {
					System.out.print(Character.toLowerCase(c));
				}
				else {
					System.out.print(c);
				}
			}
			// if a new sentence starts, set flag to true
			if ( c == '.' || c == '!' || c == '?') {
				flag = true;
			}
			
		}
		in.close();
	}

}
