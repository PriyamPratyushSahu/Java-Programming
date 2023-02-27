//Take a string as input and find type of website and protocol used,using if else

package _0_Challenges;


import java.util.Scanner;

public class _14_ProtocolWebsiteCheck {
    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);

        System.out.println("Enter a URL: ");
        String url = pp.nextLine();

        String prt = url.substring(0, url.indexOf(":"));
        String site = url.substring(url.lastIndexOf(".") + 1);

        if (prt.equals("http"))
            System.out.println("Protocol: " + "Hypertext Transfer Protocol");
        if (prt.equals("https"))
            System.out.println("Protocol: " + "Hypertext Transfer Protocol Secured");
        else if (prt.equals("ftp"))
            System.out.println("Protocol: " + "File Transfer Protocol");
        else
            System.out.println("Invalid Protocol");

        if (site.equals("com"))
            System.out.println("Website type: " + "Commercial");
        else if (site.equals("org"))
            System.out.println("Website type: " + "Organisation");
        else if (site.equals("net"))
            System.out.println("Website type: " + "Network");
        else
            System.out.println("Invalid site address");
            pp.close();
    }
}

/*
****************************** OUTPUT ******************************
Enter a URL: 
https://www.xyz.com
Protocol: Hypertext Transfer Protocol Secured
Website type: Commercial

Enter a URL: 
http://www.studynext.net    
Protocol: Hypertext Transfer Protocol
Website type: Network

Enter a URL: 
https://www.fundraise.org
Protocol: Hypertext Transfer Protocol Secured
Website type: Organisation
 */
