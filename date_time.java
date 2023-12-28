import java.time.LocalDateTime;
import java.time.LocalDateTimeFormatter;
import java.util.HashMap;
public class date_time {

public static void main(String[] args){
LocalDateTime myDate = LocalDateTime.now();
LocalDateTimeFormatter = myDate.now("HHH-mmm-sss mmm-ddd-yyy");
System.out.println(myDate);
HashMap<String,Character> chemicals = new HashMap<String,Character>();
chemicals.put("Pottasium", 'K');
chemicals.put("Sulphur", 'S');
chemicals.put("Oxygen", 'O');
chemicals.put("Hydrogen", 'H');
System.out.println(chemicals);
}
}
