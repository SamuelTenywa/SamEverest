package files;

public class tuna {

	public static void main(String[] args) {
		writefile wf = new writefile();
		wf.openFile();
		wf.addStuff();
		wf.closeFile();
		
		readfile r = new readfile();
		r.openFile();
		r.readFile();
		r.closeFile();
		
	}

}
