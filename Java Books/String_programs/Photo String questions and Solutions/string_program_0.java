import java.io.*;

class string_program_0
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pps = new BufferedReader(new InputStreamReader(System.in));
        String word;
        int i, word_count = 1;
        System.out.print("\nEnter a string as input: ");
        word = pps.readLine();
        word = word.trim();
        for(i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == 32)
                word_count++;
        }
        System.out.println("\nTotal number of words present in the string is "+ word_count);
    }
}