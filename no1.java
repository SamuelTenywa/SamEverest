package java_exercises;
import java.util.Scanner;
public class no1 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name");
		String name = scan.nextLine();
		System.out.println("Hello "+ name);
		//scan.close();
		
		System.out.println("input a number");
		int x = scan.nextInt();
		System.out.println("input next number");
		int z = scan.nextInt();
		int y = x + z;
		int c = x / z;
		System.out.println("Sum is " + y);
		System.out.println("the division is " + c);
		
		System.out.println(-5+(8*6));
		System.out.println((55+9)%9);
		System.out.println(20+-+(3*5)/8);
		System.out.println(5+15/3*2-8%3);
		
		System.out.println("+\" \" \" \" +");
		System.out.println("[| o  o  |]");
		System.out.println("+|   ^   |");
		System.out.println("+| '_ '  |");
		System.out.println("+--------+" +"\n");
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.runtime.version"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.class.path"));
		
		int e = 19;
		int d = 10;
		int f;
		
		f = e;
		e = d;
		d = f;
		
		System.out.println(e);
		System.out.println(d);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
