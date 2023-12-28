package java_exercises;

import java.io.*;
import java.util.*;


public class no2 {

	public static void main(String[] args) {

		String num = "25";
		
		char [] chr = num.toCharArray();
		int sum = 0;
		
		for(char ch: chr) {
			
			sum += Integer.parseInt(String.format("%s", ch));
		}
		System.out.println("The sum is "+ sum);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number");
		int x = scan.nextInt();
		System.out.println("Number is "+ x);
		for(int i = 1;i<=10;i++) {
			System.out.println(x +" * "+ i +" = "+(i*x));
		}
		
		scan.close();
		System.out.println("\n");
		System.out.println(area(5,8));
		System.out.println(perimeter(7,5));
		
		System.out.println("   J    a     v     v     a");
		System.out.println("   J   a a     v   v     a  a");
		System.out.println("J  J  aaaaa     v v     aaaaaa");
		System.out.println(" JJ  a     a     V     a      a");
		System.out.println((25.5*3.5-3.5*3.5));
		
		double a=25.5,y=3.5,k=40.5,r=4.5;
		
		System.out.println((a*y-y*y)/(k-r));
		
		System.out.println(circleArea(7.5));
		System.out.println(circlePerimeter(7.5));
		
		System.out.println("* * * * * * =============================");
		System.out.println(" * * * * *  =============================");
		System.out.println("* * * * * * =============================");
		System.out.println(" * * * * *  =============================");
		System.out.println("* * * * * * =============================");
		System.out.println(" * * * * *  =============================");
		System.out.println("* * * * * * =============================");
		System.out.println(" * * * * *  =============================");
		System.out.println("* * * * * * =============================");
		System.out.println("=========================================");
		System.out.println("=========================================");
		System.out.println("=========================================");
		System.out.println("=========================================");
		System.out.println("=========================================");
		System.out.println("=========================================");
		
		System.out.println();
		int  p= 25;
		int q = 39;	
		if(p == q) {
			System.out.println("p==q");
		} else if(p < q){
			System.out.println("p < q");
		} else {
			System.out.println("p <= q");
		}
		
		
		System.out.println(q!=p);
		System.out.println(q<p);
		System.out.println(q<=p);
		addNumber(25);
		System.out.println(areaHex(6, 7));
		
		System.out.println(distance(25,35,35.5,25.5));
		String word = "The quick brown fox";
		StringBuilder input = new StringBuilder();
		input.append(word);
		input.reverse();
		System.out.println(input);
		
		String complex = "The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo??";
		int count = 0;
		for(int i = 0; i < complex.length(); i++) {
			
			if(Character.isLetter(complex.charAt(i))) {
				count++;
			}	
		}
		System.out.println("Letters: "+ count);
		System.out.println("Numbers: "+count(complex));
		
		int spaceCount = 0;
		for(char c: complex.toCharArray()) {
			if(c == ' ') {
				spaceCount++;
			}
		}
		System.out.println("Spaces: "+spaceCount);
		
		
		int total = 0;
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				for(int k1 = 1; k1 <=4; k1++) {
					if(k1 != i && k1!= j && i!= j) {
						total++;
						System.out.println(i + "" + j + "" + k1);
					}
				}
			}	
		}
		System.out.println("the total number of the three digits is " + total);
		
		String originalStr = "The quick brown fox";
		String reversedStr = "";
		
		for(int i =0; i < originalStr.length(); i++) {
			reversedStr = originalStr.charAt(i) + reversedStr;
			System.out.print(originalStr.charAt(i)+ " ");
		}
		System.out.println(reversedStr);
		
				
		
	}
	
	public static double circleArea(double radius) {
		
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	} 
	
public static double circlePerimeter(double radius) {
		
		double perimeter = Math.PI * (2* radius);
		return perimeter;
	}
	
	public static int area(int a, int b) {
		return a * b;
	}
	
	public static int perimeter(int a, int b) {
		int perimeter = 2 * (a+b);
		return perimeter;
	}
	
	public static void addNumber(int x) {
		int sum = 0;
		for(int i = 0; i < x; i++) {
			sum += i;
		}
		System.out.println("The sum of digits is "+sum);
	}
	
	public static double areaHex(double length, double num) {
		double area = (num * Math.pow(length, 2)/ (4 * Math.tan(Math.PI/num)));
		return area;
	}
	public static double distance(double x1, double y1, double x2, double y2) {
		double radius = 6371.01;
		double d = radius * Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		return d;
	}
	public static int count(String input) {
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			if(Character.isDigit(input.charAt(i)))
				count++;
		}
		
		return count;
	}
	
}
