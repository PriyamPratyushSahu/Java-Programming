package sample_programs;


import java.io.IOException;
import java.io.FileWriter;  

class fileSample {
    public static void writeFile() throws IOException
    {
        FileWriter file=new FileWriter("C:\\Users\\ANUSMITA SARKAR\\Documents\\CAPGEMINI CW\\file.txt");
        file.write("Hello World");
        file.close();

    }
    public static void main(String[] args) {
    try {
		writeFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}