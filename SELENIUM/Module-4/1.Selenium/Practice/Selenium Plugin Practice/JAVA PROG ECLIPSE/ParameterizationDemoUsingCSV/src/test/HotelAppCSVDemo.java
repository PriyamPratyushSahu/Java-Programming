package test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
public class HotelAppCSVDemo {

	public static void main(String[] args) throws IOException
	{
		CSVReader cr=new CSVReader(new FileReader("C:\\Users\\ANUSMITA SARKAR\\Documents\\CAPGEMINI CW\\JAVA PROG ECLIPSE\\ParameterizationDemoUsingCSV\\src\\CSVDemo.csv"));
		List<String[]> l=cr.readAll();
		Iterator<String[]> it=l.iterator();
		String[] arr = null;
        String[] arr2=new String[l.size()];
        int i=0;
        while(it.hasNext()) {
        	arr=it.next();
            arr2[i]=arr[0];
            i++;
        }
        System.out.println(arr2[0]+""+arr2[1]);
		//String username=arr[0];
		//String password=arr[1];
		//System.out.println(username+password);
	}

}
