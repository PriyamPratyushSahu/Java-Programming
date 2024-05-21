import java.io.*;

class string_program_4
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pps = new BufferedReader(new InputStreamReader(System.in));
        String str;
        char ch;
        int len,i,vowelcount,lastpos;
        System.out.print("\nEnter a string as input: ");
        str = pps.readLine();
        str = str.trim();
        str = str + " ";
        len = str.length();
        System.out.println("\nThe words having first letter vowel\n");
        for(i = 0,lastpos = 0,vowelcount = 0; i < len; i++)
        {
            if(str.charAt(i) == 32)
            {
                ch = str.charAt(lastpos);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    vowelcount++;
                    System.out.println(vowelcount + ". " + str.substring(lastpos,i));
                }
                lastpos = i+1;
            }
        } 
        System.out.println("\nTotal number of words found: " + vowelcount);
    }
}
