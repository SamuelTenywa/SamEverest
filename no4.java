package java_exercises;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class no4 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:\\Users\\Batwala\\eclipse-workspace\\ttt\\file.txt");
		long size = Files.size(path);
		
		System.out.println("C:\\Users\\Batwala\\eclipse-workspace\\ttt\\file.txt: " + size + " bytes");
		
		timeclass time = new timeclass(13,12,34,4,11,2023);
		
		// Use a for loop to iterate from 1 to 99
		for (int i = 1; i < 100; i++) {
		      // Check if the number is odd using the modulo operator
		      if (i % 2 != 0) {
		        // Print the odd number on a new line
		        System.out.println(i);
		      }
		    }
		
		
		
		
		
		
		
	}

}
