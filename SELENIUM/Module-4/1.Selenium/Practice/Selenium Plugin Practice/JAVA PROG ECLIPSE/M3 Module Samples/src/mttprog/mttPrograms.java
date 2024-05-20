package mttprog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.TreeMap;

public class mttPrograms {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String w[]= {"virat","dhoni","sachin","dravid"};
		String t="virat";
		Arrays.sort(w);
		int p=Arrays.binarySearch(w, t);
		System.out.println(p);

		
	}
	

}
