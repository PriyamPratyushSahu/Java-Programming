//Get the username and domain name from email
//Check the email id is a gmail id

package _0_Challenges;

public class _4_EmailCheck {

    public static void main(String[] args) 
    {
      String str="priyampratyushsahoo3232@gmail.com";
      //String str="programmer@hotmail.com";
      
      int i=str.indexOf("@");
      String uname=str.substring(0,i);
      String domain=str.substring(i+1, str.length());
      
      System.out.println("Username :"+uname);
      System.out.println("Domain :"+domain);
      
      int j=domain.indexOf(".");
      String name=domain.substring(0, j);
      System.out.println("email id is a gmail id: " + name.equals("gmail"));
    }
    
}
