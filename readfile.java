package files;
import java.util.Scanner;
import java.io.File;

public class readfile{
	
	private Scanner x;
	
	public void openFile() {
		try {
			x = new Scanner(new File("read.txt"));
		} 
		catch (Exception e) {
			System.out.println("could not open");
		}
	}
	public void readFile() {
		while(x.hasNext()) {
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			System.out.printf("%s %s %s\n", a,b,c);
		}
	}
	
	public void closeFile() {
		x.close();
	}
}
