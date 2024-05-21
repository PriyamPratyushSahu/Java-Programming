import java.io.*;

class string_program_1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pps = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int len,i,j;
        System.out.print("\nEnter string of words: ");
        str = pps.readLine();
        str = str.trim();
        str = " " + str;
        len = str.length();
      //  System.out.println("\nThe string is: "+ str);
       // System.out.println("The length is: "+ len);
       char word[] = new char[len];
       for(i = 0; i < len; i++)
           word[i] = str.charAt(i); //=========>>>>>>String stored in the array
        System.out.print("\nList of words in reverse order is:\n1. ");
        for(i = len-1,j = 1; i >=0 ;i--)
        {
            if(word[i] != 32)
                System.out.print(word[i]);
            else
            {
                if(i != 0)
                {
                    j++;
                    System.out.print("\n" + j + ". ");
                }
            }
        }
    }
}