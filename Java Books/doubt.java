import java.io.*;

class doubt
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str,vow = "";
        char ch;
        int i, len, count, max_vowel, pos;
        System.out.println("\nEnter a string as input: ");
        str = br.readLine();
        str = str.trim();
        str = str.concat(" ");
        len = str.length();
        for(i = 0,pos = 0,max_vowel = 0,count= 0; i < len; i++)
        {
            if(str.charAt(i) != 32)
            {
                
                switch (str.charAt(i)) 
                {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        count++;
                    break;
                }
            }
            else
            {
                if(count > max_vowel)
                {
                    max_vowel = count;
                    vow = str.substring(pos,i);  
                } 
                count = 0;
                pos = i+1;
            }
        }

        if(max_vowel != -1)
        {
            System.out.println("The word with maximum vowel is: " + vow );
            System.out.println("\nHaving "+ max_vowel + " number of vowels in it\n");
        }
        else
        System.out.println("\nNo word present with a single vowel\n");
    }
}