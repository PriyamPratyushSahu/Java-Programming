package lab1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class ques1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime id1 = LocalTime.now(zoneid1);  
	    LocalTime id2 = LocalTime.now(zoneid2);  
	    System.out.println(id1);  
	    System.out.println(id2);  
	    LocalDate date1=LocalDate.now(zoneid1);
	    LocalDate date2=LocalDate.now(zoneid2);
	    System.out.println(date1);  
	    System.out.println(date1); 
	}

}
