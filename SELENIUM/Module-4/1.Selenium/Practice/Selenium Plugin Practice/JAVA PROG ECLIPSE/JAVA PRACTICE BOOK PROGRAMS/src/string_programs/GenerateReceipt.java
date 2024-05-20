package string_programs;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenerateReceipt {
	public int verifyParty(Receipt r)
	{
		boolean v1,v2;
		//int valid;
		 Pattern pattern = Pattern.compile("[A-Za-z]+[-|']?[A-Za-z]+ [A-Za-z]+[-|']?[A-Za-z]+", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher(r.transactionParty.buyer);
		    v1 = matcher.matches();
		    Matcher matcher2 = pattern.matcher(r.transactionParty.seller);
		    v2 = matcher2.matches();
		    if(v1==true&&v2==true)
		    	return 2;
		    else if((v1==true && v2==false)||(v1==false && v2==true))
		    	return 1;
		    else
		    	return 0;
	}
	public int calcGST(Receipt r)
	{
		//r.transactionParty.productsQR;
		String[] arrOfStr = r.productsQR.split("@");
		//r.productsQR.spli
 		int ar[]=new int[6];
        int i=0,GST=0;
        //int GST_Rate=0.12;
        for (String a : arrOfStr)
        {
            System.out.println(a);
            //String arr=a;
            String[] arr=a.split(",");
            for(String b:arr)
            {
      			//System.out.println(b);
                ar[i]=Integer.valueOf(b);
                //System.out.println(ar[i]);
                i++;
                //System.out.println(ar[i]);
                
      		}
           for(int x:ar)
        	   System.out.println(x);

           GST =((ar[0] * ar[1] + ar[2] * ar[3] + ar[4] * ar[5]) *12)/100;
            System.out.println(GST);
            
         }
        return GST;

	}
}
