package java_exercises;

public class timeclass {
	private int hour;
	private int minute;
	private int second;
	
	private int day;
	private int month;
	private int year;
	
	public timeclass() {
		
	}
	
	public timeclass(int h, int m, int s, int dy, int mon, int yr) {
		hour = h < 24 ? h : 0;
		minute = m < 60 ? m : 0;
		second = s < 60 ? s : 0;
		day = dy <= 31 ? dy : 0;
		month = mon <= 12 ? mon : 0;
		year = yr;
		System.out.println(year+"/"+month+"/"+day+"\t"+hour+":"+minute+":"+second);
	}
	
	public void setHour(int h) {
		hour = h;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setMinute(int m) {
		minute = m;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setSecond(int s) {
		second = s;
	}
	
	public int getSecond() {
		return second;
	}
	
	
	
	
	
}
