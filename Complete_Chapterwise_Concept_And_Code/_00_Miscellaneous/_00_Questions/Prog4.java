package _00_Questions;
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 
*/

import java.util.Arrays;
class Prog4 {
    public boolean isAnagram(String s, String t) {
        boolean b = true;
        if(s.length() == t.length()){
            int strSize = t.length();
            int strArr[] = new int[strSize];
            int i,j;

            for(i = 0; i < strSize; i++){
                for(j = 0; j < strSize; j++){
                    if(strArr[j] != -1){
                        if(s.charAt(i) == t.charAt(j)){
                            strArr[j] = -1;
                            break;
                        }
                    }
                }                  
            }
            for(i = 0; i < strSize; i++)
                if(strArr[i] != -1){
                    b = false;
                    break;
                }
        }
        return b;      
    }
    public boolean isAnagram2(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // Sort the character arrays
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Compare the sorted character arrays
        return Arrays.equals(sChars, tChars);
    }

     

    public static void main(String args[]){

        Prog4 obj = new Prog4();
        System.out.println(obj.isAnagram("anagram", "nagaram"));
        
    } 
}

/*
 *********************************** OUTPUT ***********************************
 true
 */