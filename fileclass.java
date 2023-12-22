package files;

import java.io.File;

public class fileclass {
	public static void main(String[] args) {
		
		File x = new File("c:\\Users\\Batwala\\Desktop\\cv_tenywa.docx");
		if(x.exists()) {
			System.out.println("The file name is "+ x.getName());
		} else {
			System.out.println("Doesnt exist");
		}
	}
}
