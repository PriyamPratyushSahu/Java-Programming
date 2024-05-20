package sample_programs;

import java.io.*;
import java.io.FileNotFoundException;

class ExceptionCheck{
	public String fileCheck(String s)  {

		String r=null;
		 try {
			 
	            // Following file does not exist
	            File file = new File(s);
	 
	            FileReader fr = new FileReader(file);
	            r="file found";
	        } catch (FileNotFoundException e) {
	           r="File does not exist";
	        }
 		return r;
		
	}
}
public class fileprog {

	public static void main(String[] args) throws IOException {
	
		        ExceptionCheck ep=new ExceptionCheck();
		        String s=ep.fileCheck("FileChk sample\\TestsAdd.java");
		        System.out.println(s);
		        
		           
		    }
		}
	



