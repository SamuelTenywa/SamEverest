package files;
import java.util.Formatter;
public class createfile {
	public static void main(String[] args) {
	Formatter x;
	try {
		x = new Formatter("india.txt");
		System.out.println("created");
	} catch(Exception e) {
		System.out.println("Not existent");
	}
	}
}