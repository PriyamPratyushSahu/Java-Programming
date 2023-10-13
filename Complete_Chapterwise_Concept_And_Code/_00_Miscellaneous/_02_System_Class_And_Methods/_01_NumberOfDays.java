import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class _01_NumberOfDays {
    public static void main(String[] args) {
        // Get today's date
        LocalDate currentDate = LocalDate.now();
        
        // Create a LocalDate for January 1, 2024
        LocalDate january1_2024 = LocalDate.of(2024, 1, 1);
        
        // Calculate the number of days between today and January 1, 2024
        long remainingDays = ChronoUnit.DAYS.between(currentDate, january1_2024);
        
        System.out.println("Remaining days until January 1, 2024: " + remainingDays + " days");
    }
}
