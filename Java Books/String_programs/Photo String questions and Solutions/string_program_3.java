import java.io.*;

class string_program_3
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pps = new BufferedReader(new InputStreamReader(System.in));
        String str,word = "";
        int len,i,maxlen,count,lastpos;
        System.out.print("\nEnter a string as input: ");
        str = pps.readLine();
        str = str.trim();
        str = str + " ";
        len = str.length();
        for(i = 0,lastpos = 0,maxlen = 0,count = 0; i < len; i++)
        {
            if(str.charAt(i) != 32)
                count++;
            else
            {
                if(count > maxlen)
                {
                    maxlen = count;
                    word = str.substring(lastpos,i);
                }
                count = 0;
                lastpos = i+1;
            }
        } 
        System.out.println("\nLongest word present in the string is: " + word);
    }
}
