package mttprog;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class mttprogram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pat=".*Q[^u]\\d+\\..";
		String line="Order QT300. Now!";
				if(Pattern.matches(pat, line))
					System.out.println(line+"matches \""+pat+"\" ");
					else
						System.out.println("NO MATCH");
			}
		
		}


