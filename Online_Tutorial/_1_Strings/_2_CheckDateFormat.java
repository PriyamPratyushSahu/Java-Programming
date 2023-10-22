//Question: Check whether the date entered in correct format or not
package _1_Strings;
import java.util.Scanner;

public class _2_CheckDateFormat {
    public static void main(String args[]) {
        Scanner pp = new Scanner(System.in);
        String dateInput;
        System.out.print("Enter date in dd/mm/yyyy format: ");
        dateInput = pp.nextLine();
        if (dateInput.matches("[0-3][0-9]/[01][0-9]/[0-9][0-9][0-9][0-9]"))
            System.out.println("\nCorrect format");
        else
            System.out.println("\n!!!! Wrong Format");
        pp.close();
        
    }
    
}
//Note: Here the dd/mm/yyyy is considered, the values might break the rule
/*
****************************** OUTPUT ******************************
Enter date in dd/mm/yyyy format: 12/01/9999

Correct format

Enter date in dd/mm/yyyy format: 34/99/1765

!!!! Wrong Format

Enter date in dd/mm/yyyy format: 18/12/1999

Correct format
*/