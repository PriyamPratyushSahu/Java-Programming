package lab1;
import java.util.Arrays;
import java.util.Scanner;
public class ques1_10 {

	static boolean isAlphabaticOrder(String s)
    {
        int n = s.length();
        char c[] = new char [n];
      
        for (int i = 0; i < n; i++) {
            c[i] = s.charAt(i);
        }
       
        Arrays.sort(c);
        for (int i = 0; i < n; i++)
            if (c[i] != s.charAt(i)) 
                return false;
               
        return true;    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String st=s.next();
		System.out.println(isAlphabaticOrder(st));
		s.close();
	}

}
