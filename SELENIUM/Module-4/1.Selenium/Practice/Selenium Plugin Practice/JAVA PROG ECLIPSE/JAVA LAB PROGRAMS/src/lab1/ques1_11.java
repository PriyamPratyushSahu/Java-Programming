package lab1;
import java.time.LocalDate;
public class ques1_11 {
	public static void main(String args[])
	{
		LocalDate currentDate = LocalDate.now();
		System.out.println("Day: "+currentDate.getDayOfMonth()+"Month: "+currentDate.getMonth()+"Year: "+currentDate.getYear());
	}
}
