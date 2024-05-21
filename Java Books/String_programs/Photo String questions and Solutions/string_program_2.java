import java.io.*;

class string_program_2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pps = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int len,i,j;
        System.out.print("\nEnter a string as input: ");
        str = pps.readLine();
        str = str.trim();
        str = str + " ";
        len = str.length();
        for(i = 0; i < len; i++)
        {
            if(str.charAt(i) != 32)
                System.out.print(str.charAt(i));
            else
                System.out.print("  ");
        }
        System.out.print("\n");
        for(i = 0,j = 0; i < len; i++)
        {
            if(str.charAt(i) != 32)
            {
                j++;
                System.out.print(j % 10);
            }
            else
                System.out.print("  ");
        }
        System.out.print("\n");
    }
}
