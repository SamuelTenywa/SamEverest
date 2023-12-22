package files;
import java.lang.*;
import java.util.Formatter;

public class writefile {
	
	private Formatter x;
	
	public void openFile() {
		try {
			x = new Formatter("teach.txt");
		} catch(Exception e){
			System.out.println("Error");
		}
	}
	public void addStuff() {
		x.format("%s%s%s", "20 ", "samuel ", "walker");
	}
	public void closeFile() {
		x.close();
	}

}
