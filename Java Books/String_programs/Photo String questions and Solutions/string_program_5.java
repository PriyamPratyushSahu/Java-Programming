import java.io.*;

class string_program_5
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pps = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int len,i,lastpos;
        System.out.print("\nEnter a string as input: ");
        str = pps.readLine();
        str = str.trim();
        str = str + " ";
        len = str.length();
        System.out.println("\nWord\t\tFrequency\n");
        for(i = 0,lastpos = 0; i < len; i++)
        {
            if(str.charAt(i) == 32)
            {
                    System.out.println("  " + str.substring(lastpos,i) + "\t\t  " + (str.substring(lastpos,i).length()));
                lastpos = i+1;
            }
        }
    }
}
