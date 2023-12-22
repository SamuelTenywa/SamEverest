package java_exercises;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.Scanner;
public class no3 {

	public static void main(String[] args) {
		System.out.println("List of available character sets:");
		SortedMap<String, Charset> charsets = Charset.availableCharsets();
		
		for(Map.Entry<String, Charset> entry : charsets.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		char z = 'Z';
		int ascii = (int) z;
		System.out.println("The ASCII value of " + z + " is: " + ascii);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your password?");
		String password = scanner.nextLine();
		System.out.println("The password is " + password);
		
		System.out.println("\nTwinkle, twinkle, littel star,");
		System.out.println("\tHow I wonder what you are");
		System.out.println("\t\tUp above the world so high,");
		System.out.println("\t\tLike the diamonds in the sky.");
		System.out.println("Twinkle, twinkle, little star");
		System.out.println("\tHow i wonder what you are");
		
		System.out.print("\nEnter a nmuber: "); 
		int n = scanner.nextInt();
		int nn = n * 11;
		int nnn = n * 111;
		int result = n + nn + nnn;
		System.out.println("Result: " + result);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
