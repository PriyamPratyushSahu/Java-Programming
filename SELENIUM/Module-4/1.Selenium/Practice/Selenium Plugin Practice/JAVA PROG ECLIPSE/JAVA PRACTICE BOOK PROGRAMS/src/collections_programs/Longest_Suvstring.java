package collections_programs;

import java.util.HashSet;
import java.util.Set;

class Source5
{
	public int lengthOfLongestSubstring(String s, Set<Character> set)
	{
		/*String output = "";
	    for (int start = 0; start < s.length(); start++) {
	       // Set<Character> visited = new HashSet<>();
	        //set = new HashSet<>();

	        int end = start;
	        for (; end < s.length(); end++) {
	            char currChar = s.charAt(end);
	            if (set.contains(currChar)) {
	                break;
	            } else {
	                set.add(currChar);
	            }
	        }
	        if (output.length() < end - start + 1) {
	            output = s.substring(start, end);
	        }
	    }
	    return output.length();*/
		int maxLen = 0;
		 
	     for(int i = 0; i < s.length(); i++) {
	 
	         for(int j = i+1; j <= s.length(); j++) {
	 
	             boolean isUnique = true;
	             set = new HashSet<>();
	 
	             for(int p = i; p < j; p++) {
	                 char ch = s.charAt(p);
	 
	                 if(set.contains(ch)) {
	                     isUnique = false;
	                     break;
	                  }
	 
	                   set.add(ch);
	 
	             }
	 
	             if(isUnique) {
	                maxLen = Math.max(maxLen, j-i);
	             }
	          }
	      }
	 
	       return maxLen;
	}
}

public class Longest_Suvstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source5 s= new Source5();
		Set<Character> t=new HashSet<Character>();
		System.out.println(s.lengthOfLongestSubstring("abcabcbb", t));
		//System.out.println(t);
		
	}

}
