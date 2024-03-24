//Write a program in java to calculate and display the number of days remaining between two dates

package _00_Questions;

// Importing the LocalDate class from the java.time package
import java.time.LocalDate;
// Importing the ChronoUnit enum from the java.time.temporal package
import java.time.temporal.ChronoUnit;

public class Prog6 {
    public static void main(String[] args) {
        // Get today's date
        LocalDate currentDate = LocalDate.now();
        
        // Create a LocalDate for January 1, 2024
        LocalDate futureDate = LocalDate.of(2025, 5, 31);
        
        // Calculate the number of days between today and May 31, 2024
        long remainingDays = ChronoUnit.DAYS.between(currentDate, futureDate);
        
        System.out.println("Remaining days until May 31, 2024: " + remainingDays + " days");
    }
}
