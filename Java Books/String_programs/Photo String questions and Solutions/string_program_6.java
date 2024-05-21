import java.io.*;

class string_program_6
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pps = new BufferedReader(new InputStreamReader(System.in));
        String word,st;
        int i;
        System.out.print("\nEnter the word as input: ");
        word = pps.readLine();
        word = word.trim();
        if(word.length() >= 5)
        {
            System.out.println("\nThe list of 3 lettered combinations are:");
            for(i = 0; i < (word.length()-2); i++)
            {
                System.out.println(word.substring(i,i+3));
            }
        }
        else
            System.out.println("\nSorry the word size is less than five");
    }
}