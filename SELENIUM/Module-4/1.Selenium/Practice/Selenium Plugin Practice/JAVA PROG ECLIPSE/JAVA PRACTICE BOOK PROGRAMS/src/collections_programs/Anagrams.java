package collections_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Source6
{
	public List<Integer> findAnagrams(String s, String p) {
        List <Integer> ans = new ArrayList<>();
        int[] sMap = new int[26];
        int[] pMap = new int[26];
        
        for(int i = 0; i < p.length(); i++)
            pMap[p.charAt(i) - 'a']++;
        
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            sMap[s.charAt(i) - 'a']++;
             
            if(i >= p.length()){
                sMap[s.charAt(start) - 'a']--;
                start++;
            }
            if(Arrays.equals(sMap,pMap)) 
                ans.add(start);
        } 
        return ans;
    }
}

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source6 s=new Source6();
		System.out.println(s.findAnagrams("cbaebabacd", "abc"));
	}

}
