package lab1;

import java.time.LocalDate;

public class ques1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String pDate="31/12/1998";  
		Date date1;
	    try {
			date1=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(pDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	    int expmonths=10,expyears=3;
	    Date dt=date1.;*/
		LocalDate date = LocalDate.parse("2020-05-03");
		LocalDate newDate = date.plusMonths(2); 
		LocalDate newDate2 = newDate.plusYears(2); 
		System.out.println(newDate2);
	}

}
