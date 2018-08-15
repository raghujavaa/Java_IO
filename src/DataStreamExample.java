import java.io.FileInputStream;

//Java FileInputStream example 1: read single character
public class DataStreamExample {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("D:\\testout.txt");
			int i = fin.read();
			System.out.print((char) i);

			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
/*
 * Note: Before running the code, a text file named as "testout.txt" is required
 * to be created. In this file, we are having following content:
 * 
 * Welcome to javatpoint. After executing the above program, you will get a
 * single character from the file which is 87 (in byte form). To see the text,
 * you need to convert it into character.
 * 
 * Output:
 * 
 * W
 */