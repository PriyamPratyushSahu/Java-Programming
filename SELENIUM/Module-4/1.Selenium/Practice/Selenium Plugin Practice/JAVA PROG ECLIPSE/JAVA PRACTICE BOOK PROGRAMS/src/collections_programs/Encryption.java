package collections_programs;

import java.util.HashSet;
import java.util.Set;

class Source7
{
	public int uniqueMorseRepresentations(String[] words)
	{
	        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
	                         "....","..",".---","-.-",".-..","--","-.",
	                         "---",".--.","--.-",".-.","...","-","..-",
	                         "...-",".--","-..-","-.--","--.."};

	        Set<String> seen = new HashSet();
	        for (String word: words) {
	            StringBuilder code = new StringBuilder();
	            for (char c: word.toCharArray())
	                code.append(MORSE[c - 'a']);
	            seen.add(code.toString());
	        }

	        return seen.size();
	    }
	}


public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source7 s=new Source7();
		String[] MORSE = new String[]{"gin", "zen", "gig", "msg"};
		System.out.println(s.uniqueMorseRepresentations(MORSE));		

	}

}
